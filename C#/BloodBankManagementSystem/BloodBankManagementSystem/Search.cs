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
    class Search
    {
        string connectionString = "Data Source=Shadhin-PC\\SQLExpress;Initial Catalog=MaximizeBloodBank;Integrated Security=True";

        public DataGridView showSearchBlood(DataGridView requestDataGridView,  string bloodGroup)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            string commandString = "Select * from DonationInfo where BloodGroup = '" + bloodGroup + "' AND Available = 'Yes'";
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

        public DataGridView showSearchDonor(DataGridView requestDataGridView, string mobileNUmber)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            string commandString = "Select * from DonorInfo where MobileNumber = '" + mobileNUmber + "'";
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
