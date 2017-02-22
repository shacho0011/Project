using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BloodBankManagementSystem
{
    class Clint
    {
        string connectionString = "Data Source=Shadhin-PC\\SQLExpress;Initial Catalog=MaximizeBloodBank;Integrated Security=True";
        
        public void insertIntoDonorInfo(string mobileNumber, string name, string bloodGroup, string sex, string address, string email, string alternateMNumber)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Insert into DonorInfo (MobileNumber, Name, BloodGroup, Sex, Address, Email, AlternateMNumber, Date) values ('"+mobileNumber+"','"+name+"','"+bloodGroup+"','"+sex+"','"+address+"','"+email+"','"+alternateMNumber+"','"+DateTime.Now+"')";
            SqlCommand sqlCommand = new SqlCommand(commandString,sqlConnection);

            try
            {
                sqlCommand.ExecuteNonQuery();
                MessageBox.Show("Registration Completed");
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                sqlConnection.Close();
            }
        }


        public void insertIntoDonationInfo(string mobileNumber, string bloodGroup)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Insert into DonationInfo (MobileNumber, BloodGroup, Available, Date) values ('" + mobileNumber + "','" + bloodGroup + "','Yes','" + DateTime.Now + "')";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);

            try
            {
                sqlCommand.ExecuteNonQuery();
                MessageBox.Show("Donation Completed");
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                sqlConnection.Close();
            }
        }

        public Boolean checkDonor(string mobileNumber, string bloodGroup)
        {
            Boolean validDonor = false;
            string mNumber = null, bloodG = null;
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Select MobileNumber, BloodGroup From DonorInfo";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read())
                {
                    mNumber = sqlDataReader["MobileNumber"].ToString();
                    bloodG = sqlDataReader["BloodGroup"].ToString();
                    if (mobileNumber.Equals(mNumber) && bloodGroup.Equals(bloodG))
                    {
                        validDonor = true;
                    }
                }
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                sqlConnection.Close();
            }
            return validDonor;
        }


        public Boolean checkDate(string mobileNumber, string bloodGroup)
        {
            Boolean validDate = false;
            int count = 0;
            DateTime date = DateTime.Now, currentDate = DateTime.Now;
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Select Date From DonationInfo where MobileNumber = '"+mobileNumber+"' And BloodGroup = '"+bloodGroup+"'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            SqlDataReader sqlDataReader;
            try
            {
                sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read())
                {
                    date = Convert.ToDateTime(sqlDataReader["Date"]);
                }
                sqlConnection.Close();
                sqlConnection.Open();
                sqlDataReader = sqlCommand.ExecuteReader();
                while (!sqlDataReader.Read() && count == 0)
                {
                    validDate = true;
                    count = 1;
                }
                sqlConnection.Close();

                TimeSpan difference = currentDate - date;
                if (difference.TotalDays > 90)
                {
                    validDate = true;
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                sqlConnection.Close();
            }
            return validDate;
        }

        public DateTime returnValidDate(string mobileNumber, string bloodGroup)
        {
            DateTime validDate = default(DateTime);
            DateTime date = default(DateTime);
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Select Date From DonationInfo where MobileNumber = '" + mobileNumber + "' And BloodGroup = '" + bloodGroup + "'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            SqlDataReader sqlDataReader;
            try
            {
                sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read())
                {
                    date = Convert.ToDateTime(sqlDataReader["Date"]);
                    
                }
                validDate = date.AddDays(91);
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                sqlConnection.Close();
            }
            return validDate;
        }

        public void insertIntoRequestInfo(string name, string mobileNumber, string bloodGroup, string sex, string address, string email)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Insert into RequestInfo (Name, MobileNumber, BloodGroup, Sex, Address, Email, Date, Approval) values ('" + name + "','" + mobileNumber + "','" + bloodGroup + "','" + sex + "','" + address + "','" + email + "','" + DateTime.Now + "','No')";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);

            try
            {
                sqlCommand.ExecuteNonQuery();
                MessageBox.Show("Posted");
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                sqlConnection.Close();
            }
        }


        public DataGridView showDonorInfo(DataGridView donorDataGridView)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            string commandString = "Select * from DonorInfo";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataAdapter sqlDataAdapter = new SqlDataAdapter(sqlCommand);
                DataTable dataTable = new DataTable();
                sqlDataAdapter.Fill(dataTable);
                BindingSource bindingSource = new BindingSource();
                bindingSource.DataSource = dataTable;
                donorDataGridView.DataSource = bindingSource;
                sqlDataAdapter.Update(dataTable);
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            return donorDataGridView;
        }

        public void updateDonationInfo(string mobileNumber, string name, string address, string email, string alternateMNumber)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Update DonorInfo Set Name = '"+name+"',Address = '"+address+"',Email = '"+email+"', AlternateMNUmber = '"+alternateMNumber+"' where MobileNumber = '" + mobileNumber + "'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlCommand.ExecuteNonQuery();
                sqlConnection.Close();
                MessageBox.Show("Update Successful");
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                sqlConnection.Close();
            }
        }
    }
}
