using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ShopManagement
{
    class UserSubscription
    {
        string connectionString = "Data Source=Shadhin-PC\\SQLExpress;Initial Catalog=ShopManagementDB;Integrated Security=True;Pooling=False";
        string commandString = null;
        public void addUser(string userName, string userPassword, string userFullname, string userAddress, string userEmail, string userContact )
        {
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Insert into UserInfo (UserName, UserPassword, UserFullName, UserAddress, UserEmail, UserContact) values ('" + userName + "','" + userPassword + "','" + userFullname + "','" + userAddress + "','" + userEmail + "','" + userContact + "')";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                sqlCommand.ExecuteNonQuery();
                MessageBox.Show("User Subscription successfull");
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }  
        }

        public Boolean userLogin(string userName, string userPassword)
        {
            Boolean userLogin = false;
            string password = null;
            SqlConnection sqlConnection = new SqlConnection(connectionString);
            commandString = "Select UserPassword From UserInfo where UserName = '" + userName + "'";
            SqlCommand sqlCommand = new SqlCommand(commandString, sqlConnection);
            try
            {
                sqlConnection.Open();
                SqlDataReader sqlDataReader = sqlCommand.ExecuteReader();
                while (sqlDataReader.Read())
                {
                    password = sqlDataReader["UserPassword"].ToString();
                }
                if (userPassword.Equals(password))
                {
                    userLogin = true;
                }
                sqlConnection.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            return userLogin;
        }
    }
}
