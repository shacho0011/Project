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
    class Management
    {
        string connectionString = "Data Source=Shadhin-PC\\SQLExpress;Initial Catalog=MaximizeBloodBank;Integrated Security=True";

        public DataGridView showRequestInfo(DataGridView requestDataGridView)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            string commandString = "Select * from RequestInfo where Approval = 'No'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataAdapter sqlDataAdapter = new SqlDataAdapter(sqlCommand);
                DataTable dataTable = new DataTable();
                sqlDataAdapter.Fill(dataTable);
                BindingSource bindingSource = new BindingSource();
                bindingSource.DataSource = dataTable;
                requestDataGridView.DataSource = bindingSource;
                sqlDataAdapter.Update(dataTable);
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            return requestDataGridView;
        }

        public DataGridView showCustomRequestInfo(DataGridView requestDataGridView, string sortOrder)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            string commandString = null;

            if (sortOrder.Equals("Pending"))
            {
                commandString = "Select * from RequestInfo where Approval = 'No'";
            }
            else if (sortOrder.Equals("All"))
            {
                commandString = "Select * from RequestInfo";
            }
            else
            {
                commandString = "Select * from RequestInfo where BloodGroup = '" + sortOrder + "' And Approval = 'No'";
            }

            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataAdapter sqlDataAdapter = new SqlDataAdapter(sqlCommand);
                DataTable dataTable = new DataTable();
                sqlDataAdapter.Fill(dataTable);
                BindingSource bindingSource = new BindingSource();
                bindingSource.DataSource = dataTable;
                requestDataGridView.DataSource = bindingSource;
                sqlDataAdapter.Update(dataTable);
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            return requestDataGridView;
        }

        public void updateRequestInfo(int requestCode)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Update RequestInfo Set Approval = 'Yes' where RequestCode = '"+requestCode+"'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);

            try
            {
                sqlCommand.ExecuteNonQuery();
                MessageBox.Show("Request Approved");
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

        public string bloodGroupPicker(int requestCode)
        {
            string bloodGroup = null;
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Select BloodGroup From RequestInfo where RequestCode = '" + requestCode + "'";
            SqlCommand sqlCommand;
            sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read())
                {
                    bloodGroup = sqlDataReader["BloodGroup"].ToString();
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
            return bloodGroup;
        }
        public int donorPicker(string bloodGroup)
        {
            int donationId = 0;
            int count = 0;
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Select DonationId From DonationInfo where BloodGroup = '" + bloodGroup + "' AND Available = 'Yes'";
            SqlCommand sqlCommand;
            sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read()&&count==0)
                {
                    donationId = int.Parse(sqlDataReader["DonationId"].ToString());
                    count = 1;
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
            return donationId;
        }

        public void insertIntoAssignInfo(int requestCode, int donationId, string bloodGroup)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Insert into AssignInfo (RequestCode, DonationId, BloodGroup, Date) values ('" + requestCode + "','" + donationId + "','"+bloodGroup+"','" + DateTime.Now + "')";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlCommand.ExecuteNonQuery();
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

        public void updateDonationInfo(int donationId)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Update DonationInfo Set Available = 'No' where DonationId = '" + donationId + "'"; 
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlCommand.ExecuteNonQuery();
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


        public DataGridView showAssignInfo(DataGridView requestDataGridView)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            string commandString = "Select * from AssignInfo";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataAdapter sqlDataAdapter = new SqlDataAdapter(sqlCommand);
                DataTable dataTable = new DataTable();
                sqlDataAdapter.Fill(dataTable);
                BindingSource bindingSource = new BindingSource();
                bindingSource.DataSource = dataTable;
                requestDataGridView.DataSource = bindingSource;
                sqlDataAdapter.Update(dataTable);
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            return requestDataGridView;
        }

        public string name { get; set; } 
        public string mobileNumber {get; set;}

        public Management requesterPicker(int requestCode)
        {
            Management managementObject = new Management();
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Select Name, MobileNumber From RequestInfo where RequestCode = '" + requestCode + "'";
            SqlCommand sqlCommand;
            sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read())
                {
                    managementObject.name = sqlDataReader["Name"].ToString();
                    managementObject.mobileNumber = sqlDataReader["MobileNumber"].ToString();
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
            return managementObject;
        }


        public string donorMobileNumberPicker(int donationId)
        {
            string donorModileNumber = null;
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Select MobileNumber From DonationInfo where DonationId = '" + donationId + "'";
            SqlCommand sqlCommand;
            sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read())
                {
                    donorModileNumber = sqlDataReader["MobileNumber"].ToString();
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
            return donorModileNumber;
        }

        public string donorNamePicker(string mNumber)
        {
            string donorName = null;
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            sqlConnection.Open();
            string commandString = "Select Name From DonorInfo where MobileNumber = '" + mNumber + "'";
            SqlCommand sqlCommand;
            sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read())
                {
                    donorName = sqlDataReader["Name"].ToString();
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
            return donorName;
        }

        public DataGridView showDonationInfo(DataGridView requestDataGridView)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            string commandString = "Select * from DonationInfo where Available = 'Yes'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataAdapter sqlDataAdapter = new SqlDataAdapter(sqlCommand);
                DataTable dataTable = new DataTable();
                sqlDataAdapter.Fill(dataTable);
                BindingSource bindingSource = new BindingSource();
                bindingSource.DataSource = dataTable;
                requestDataGridView.DataSource = bindingSource;
                sqlDataAdapter.Update(dataTable);
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            return requestDataGridView;
        }

        public DataGridView showCustomDonationInfo(DataGridView requestDataGridView, string groupBy)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            string commandString = null;
            if (groupBy.Equals("All"))
            {
                commandString = "Select * from DonationInfo where Available = 'Yes'";
            }
            else
            {
                commandString = "Select * from DonationInfo where BloodGroup = '" + groupBy + "' AND Available = 'Yes'";
            }

            
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataAdapter sqlDataAdapter = new SqlDataAdapter(sqlCommand);
                DataTable dataTable = new DataTable();
                sqlDataAdapter.Fill(dataTable);
                BindingSource bindingSource = new BindingSource();
                bindingSource.DataSource = dataTable;
                requestDataGridView.DataSource = bindingSource;
                sqlDataAdapter.Update(dataTable);
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            return requestDataGridView;
        }

    }
}
