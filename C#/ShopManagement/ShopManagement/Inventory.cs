using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Windows.Forms;
using System.Data;

namespace ShopManagement
{
    public class Inventory
    {
        public string productName { get; set; }
        public string productCompany { get; set; }
        public float productPrice { get; set; }
        public int productUnit { get; set; }
        public string productCode { get; set; }

        string connectionString = "Data Source=Shadhin-PC\\SQLExpress;Initial Catalog=ShopManagementDB;Integrated Security=True;Pooling=False";
        string commandString = null;
        public Inventory()
        {
            productName = null;
            productCompany = null;
            productPrice = 0;
            productUnit = 0;
            productCode = null;
        }

        public DataGridView showInventory(DataGridView dataGridView)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Select * from Inventory";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataAdapter sqlDataAdapter = new SqlDataAdapter(sqlCommand);
                DataTable dataTable = new DataTable();
                sqlDataAdapter.Fill(dataTable);
                BindingSource bindingSource = new BindingSource();
                bindingSource.DataSource = dataTable;
                dataGridView.DataSource = bindingSource;
                sqlDataAdapter.Update(dataTable);
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            return dataGridView;
        }

        public void addInventory(string code, string product, string company, float price, int unit)
        {
            productName = product;
            productCompany = company;
            productPrice = price;
            productUnit = unit;
            productCode = code;
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Insert into Inventory (ProductCode, ProductName, ProductCompany, ProductPrice, ProductUnit) values ('" + productCode + "','" + productName + "','" + productCompany + "','" + productPrice + "','" + productUnit + "')";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                sqlCommand.ExecuteNonQuery();
                MessageBox.Show("Product added successfully");
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }  
        }

        public void updateInventory(string code, string name, float nPrice, int unit, int nUnit)
        {
            productCode = code;
            productUnit = unit;

            int updatedUnit = unit + nUnit;
            float updatedPrice = nPrice; 
            
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Update Inventory Set ProductName = '" + name + "', ProductPrice = '" + updatedPrice + "', ProductUnit = '" + updatedUnit + "' where ProductCode = '" + productCode + "'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                sqlCommand.ExecuteNonQuery();
                MessageBox.Show("Update successfull");
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        public Inventory search(string product)
        {

            Inventory searchDetails = new Inventory();
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Select * from Inventory where ProductName = '"+product+"'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read())
                {
                    searchDetails.productCode = sqlDataReader["ProductCode"].ToString();
                    searchDetails.productName = sqlDataReader["ProductName"].ToString();
                    searchDetails.productCompany = sqlDataReader["ProductCompany"].ToString();
                    searchDetails.productPrice = float.Parse(sqlDataReader["ProductPrice"].ToString());
                    searchDetails.productUnit = int.Parse(sqlDataReader["ProductUnit"].ToString());
                }
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            return searchDetails;
        }

        public void updateUnit(string code, int soldUnit)
        {
            int currentProductUnit = 0;
            int updateUnit = 0;
            commandString = "Select ProductUnit from Inventory where ProductCode = '" + code + "'";
            try
            {
                SqlConnection sqlConnection = new SqlConnection(connectionString);
                SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
                sqlConnection.Open();
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read())
                {
                    currentProductUnit = int.Parse(sqlDataReader["ProductUnit"].ToString());
                    updateUnit = currentProductUnit - soldUnit;
                }
                commandString = "Update Inventory Set ProductUnit = '" + updateUnit + "' where ProductCode = '" + code + "'";
                sqlCommand = new SqlCommand(commandString, sqlConnection);
                try
                {
                    sqlConnection.Close();
                    sqlConnection.Open();
                    sqlCommand.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    MessageBox.Show(ex.Message);
                }
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

    }
}
