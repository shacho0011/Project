using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ShopManagement
{
    class Invoice
    {
        string productCode { get; set; }
        int productunit { get; set; }
        float total { get; set; }
        string connectionString = "Data Source=Shadhin-PC\\SQLExpress;Initial Catalog=ShopManagementDB;Integrated Security=True;Pooling=False";
        string commandString = null;

        public float addItem(string code, int unit, float totalAmount)
        {
            productCode = code;
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Select ProductName, ProductCompany, ProductPrice, ProductUnit from Inventory where ProductCode = '" + code + "'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                string productName = null;
                string productCompany = null;
                float productPrice = 0;
                int productUnit = 0;
                float totalPrice = 0;
                while (sqlDataReader.Read())
                {
                    productName = sqlDataReader["ProductName"].ToString();
                    productCompany = sqlDataReader["ProductCompany"].ToString();
                    productPrice = float.Parse(sqlDataReader["ProductPrice"].ToString());
                    productUnit = unit;
                    totalPrice = productPrice*productUnit;
                    total = totalAmount + totalPrice;
                }
                commandString = "Insert into TemporaryInvoice (ProductCode, ProductName, ProductUnit, ProductPrice, TotalPrice) values ('" + code + "','" + productName + "','" + productUnit + "','" + productPrice + "','" + totalPrice + "')";
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
            return total;
        }

        public DataGridView invoiceDataGridView(DataGridView dataGridView)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Select * from TemporaryInvoice";
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


        public void addInvoice(string payment, string totalAmount)
        {
            Inventory inventoryObject = new Inventory();

            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Select * from TemporaryInvoice";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                string productCode = null;
                string productName = null;
                float productPrice = 0;
                int productUnit = 0;
                float totalPrice = 0;
                string paymentMethod = null;
                while (sqlDataReader.Read())
                {
                    productCode = sqlDataReader["ProductCode"].ToString();
                    productName = sqlDataReader["ProductName"].ToString();
                    productPrice = float.Parse(sqlDataReader["ProductPrice"].ToString());
                    productUnit = int.Parse(sqlDataReader["ProductUnit"].ToString()); ;
                    totalPrice = float.Parse(sqlDataReader["TotalPrice"].ToString());
                    paymentMethod = payment;
                    inventoryObject.updateUnit(productCode, productUnit);
                    insertItemToInvoice(productCode, productName, productPrice, productUnit, totalPrice);
                }
                MessageBox.Show("Total Amount: " + totalAmount);
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        public void reset()
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Delete From TemporaryInvoice";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                sqlCommand.ExecuteNonQuery();

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        public void updateTemporaryInvoice(string code)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Delete From TemporaryInvoice where ProductCode = '"+code+"'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                sqlCommand.ExecuteNonQuery();

            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        public void insertItemToInvoice(string pCode, string pName, float pPrice, int pUnit, float tPrice)
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Insert into Invoice (Date, ProductCode, ProductName, ProductPrice, ProductUnit, TotalPrice) values ('" + DateTime.Now + "','" + pCode + "','" + pName + "','" + pPrice + "','" + pUnit + "','" + tPrice + "')";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                sqlCommand.ExecuteNonQuery();
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }  
        }

        
    }
}
