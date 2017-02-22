using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ShopManagement
{
    
    public partial class UserInterface : Form
    {
        int count = 0;
        string managerUserName = "admin";
        string managerUserPassword = "admin";
        List<Panel> listPanel = new List<Panel>();
        public UserInterface()
        {
            InitializeComponent();
            timer.Start();
            managerUserPasswordTextBox.PasswordChar = '*';
            userPasswordLoginTextBox.PasswordChar = '*';
            userPasswordTextBox.PasswordChar = '*';
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            listPanel.Add(billPanel);
            listPanel.Add(shopManagerLoginPanel);
            listPanel.Add(shopManagerPanel);
            listPanel.Add(addProductPanel);
            listPanel.Add(inventoryShopPanel);
            listPanel.Add(requestShopPanel);
            listPanel.Add(managerLoginPanel);
            listPanel.Add(managerPanel);
            listPanel.Add(userSubscriptionPanel);
            listPanel.Add(inventoryReportPanel);
            listPanel.Add(sellsReportPanel);
            listPanel.Add(requestManagerPanel);
            listPanel.Add(aboutPanel);
            listPanel.Add(homePanel);
            listPanel.Add(updateProductPanel);
            listPanel[13].Visible = true;
            listPanel[13].Dock = DockStyle.Fill;
            listPanel[13].BringToFront();
        }

        private void timeLabel_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void homeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            homePanel.Dock = DockStyle.Fill;
            listPanel[13].Visible = true;
            listPanel[13].BringToFront();
        }

        private void aboutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            aboutPanel.Dock = DockStyle.Fill;
            listPanel[12].Visible = true;
            listPanel[12].BringToFront();
        }

        private void billToolStripMenuItem_Click(object sender, EventArgs e)
        {
            billPanel.Dock = DockStyle.Fill;
            listPanel[0].Visible = true;
            listPanel[0].BringToFront();

            Inventory productList = new Inventory();
            billInventoryDataGridView = productList.showInventory(billInventoryDataGridView);
        }

        private void shopManagerToolStripMenuItem_Click(object sender, EventArgs e)
        {
            shopManagerLoginPanel.Dock = DockStyle.Fill;
            listPanel[1].Visible = true;
            listPanel[1].BringToFront();
        }

        private void managerToolStripMenuItem_Click(object sender, EventArgs e)
        {
            managerLoginPanel.Dock = DockStyle.Fill;
            listPanel[6].Visible = true;
            listPanel[6].BringToFront();
        }

        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void mainPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void footerPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void timer_Tick(object sender, EventArgs e)
        {
            DateTime dateTime = DateTime.Now;
            this.timeLabel.Text = dateTime.ToString();
        }

        private void label11_Click(object sender, EventArgs e)
        {

        }

        private void label10_Click(object sender, EventArgs e)
        {

        }

        private void button3_Click(object sender, EventArgs e)
        {
            Invoice invoiceObject = new Invoice();
            string productCode = null;
            float productTotalPrice = 0;
            float totalPrice = float.Parse(totalAmountTextBox.Text);
            try
            {
                foreach (DataGridViewRow row in this.invoiceDataGridView.SelectedRows)
                {
                    productCode = row.Cells["ProductCode"].Value.ToString();
                    productTotalPrice = float.Parse(row.Cells["TotalPrice"].Value.ToString());
                    totalPrice = totalPrice - productTotalPrice;
                }

                invoiceObject.updateTemporaryInvoice(productCode);
                invoiceDataGridView = invoiceObject.invoiceDataGridView(invoiceDataGridView);

                totalAmountTextBox.Text = totalPrice.ToString();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }





        }

        private void dataGridView2_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void textBox7_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox8_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox9_TextChanged(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void label8_Click(object sender, EventArgs e)
        {

        }

        private void label9_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            Invoice invoiceObject = new Invoice();
            invoiceObject.addInvoice(paymentComboBox.Text, totalAmountTextBox.Text);
            invoiceObject.reset();
            count = 0;
            Inventory inventoryObject = new Inventory();
            inventoryObject.showInventory(billInventoryDataGridView);
        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void label12_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Inventory search = new Inventory();
            search = search.search(searchText.Text);
            productCodeTextBox.Text = search.productCode;
            productNameTextBox.Text = search.productName;
            ProductCompanyTextBox.Text = search.productCompany;
            productPriceTextBox.Text = search.productPrice.ToString();
            productUnitTextBox.Text = search.productUnit.ToString();

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void button7_Click(object sender, EventArgs e)
        {
            listPanel[4].Visible = false;
            listPanel[5].Visible = false;
            listPanel[14].Visible = false;

            shopManagerPanel.Dock = DockStyle.Fill;
            listPanel[2].Visible = true;
            listPanel[2].BringToFront();

            addProductPanel.Size = new Size(700, 600);
            addProductPanel.Dock = DockStyle.Right;
            listPanel[3].Visible = true;
            listPanel[3].BringToFront();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            listPanel[3].Visible = false;
            listPanel[5].Visible = false;
            listPanel[14].Visible = false;
            
            shopManagerPanel.Dock = DockStyle.Fill;
            listPanel[2].Visible = true;
            listPanel[2].BringToFront();

            inventoryShopPanel.Size = new Size(700, 600);
            inventoryShopPanel.Dock = DockStyle.Right;
            listPanel[4].Visible = true;
            listPanel[4].BringToFront();

            Inventory inventoryObject = new Inventory();
            inventoryObject.showInventory(shopInventoryDataGridView);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            listPanel[3].Visible = false;
            listPanel[4].Visible = false;
            listPanel[14].Visible = false;

            shopManagerPanel.Dock = DockStyle.Fill;
            listPanel[2].Visible = true;
            listPanel[2].BringToFront();

            requestShopPanel.Size = new Size(700, 600);
            requestShopPanel.Dock = DockStyle.Right;
            listPanel[5].Visible = true;
            listPanel[5].BringToFront();

            
        }

        private void button4_Click(object sender, EventArgs e)
        {
            string userName = userNameLoginTextBox.Text;
            string userPassword = userPasswordLoginTextBox.Text;
            Boolean login;
            UserSubscription userObject = new UserSubscription();
            login = userObject.userLogin(userName, userPassword);
            if (login)
            {
                userName = null;
                userPassword = null;
                userNameLoginTextBox.Text = null;
                userPasswordLoginTextBox.Text = null;
                login = false;
                listPanel[3].Visible = false;
                listPanel[4].Visible = false;
                listPanel[5].Visible = false;
                shopManagerPanel.Dock = DockStyle.Fill;
                listPanel[2].Visible = true;
                listPanel[2].BringToFront();
            }
            else MessageBox.Show("Check User Name or Password");
        }

        private void managerLoginPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void button12_Click(object sender, EventArgs e)
        {
            string mUserName = managerUserNameTextBox1.Text;
            string mUserPassword = managerUserPasswordTextBox1.Text;
            if (mUserName.Equals(managerUserName) && mUserPassword.Equals(managerUserPassword))
            {
                mUserName = null;
                mUserPassword = null;
                managerUserNameTextBox1.Text = null;
                managerUserPasswordTextBox1.Text = null;
                managerPanel.Dock = DockStyle.Fill;
                listPanel[7].Visible = true;
                listPanel[7].BringToFront();
            }
            else
            {
                MessageBox.Show("Check User Name or Password");
            }
        }

        private void button16_Click(object sender, EventArgs e)
        {
            listPanel[9].Visible = false;
            listPanel[10].Visible = false;
            listPanel[11].Visible = false;

            managerPanel.Dock = DockStyle.Fill;
            listPanel[7].Visible = true;
            listPanel[7].BringToFront();

            userSubscriptionPanel.Size = new Size(700, 600);
            userSubscriptionPanel.Dock = DockStyle.Right;
            listPanel[8].Visible = true;
            listPanel[8].BringToFront();
        }

        private void button15_Click(object sender, EventArgs e)
        {
            listPanel[8].Visible = false;
            listPanel[10].Visible = false;
            listPanel[11].Visible = false;

            managerPanel.Dock = DockStyle.Fill;
            listPanel[7].Visible = true;
            listPanel[7].BringToFront();

            inventoryReportPanel.Size = new Size(700, 600);
            inventoryReportPanel.Dock = DockStyle.Right;
            listPanel[9].Visible = true;
            listPanel[9].BringToFront();

            Inventory inventoryObject = new Inventory();
            inventoryObject.showInventory(inventoryReportDataGridView);

        }

        private void button13_Click(object sender, EventArgs e)
        {
            listPanel[8].Visible = false;
            listPanel[9].Visible = false;
            listPanel[11].Visible = false;

            managerPanel.Dock = DockStyle.Fill;
            listPanel[7].Visible = true;
            listPanel[7].BringToFront();

            sellsReportPanel.Size = new Size(700, 600);
            sellsReportPanel.Dock = DockStyle.Right;
            listPanel[10].Visible = true;
            listPanel[10].BringToFront();
        }

        private void button14_Click(object sender, EventArgs e)
        {
            listPanel[8].Visible = false;
            listPanel[9].Visible = false;
            listPanel[10].Visible = false;

            managerPanel.Dock = DockStyle.Fill;
            listPanel[7].Visible = true;
            listPanel[7].BringToFront();

            requestManagerPanel.Size = new Size(700, 600);
            requestManagerPanel.Dock = DockStyle.Right;
            listPanel[11].Visible = true;
            listPanel[11].BringToFront();
        }

        private void label37_Click(object sender, EventArgs e)
        {

        }

        private void label39_Click(object sender, EventArgs e)
        {

        }

        private void addInventoryButton_Click(object sender, EventArgs e)
        {
            Invoice invoice = new Invoice();
            string productCode = null;
            int productUnit = 0;
            float totalAmount = 0;
            try
            {
                productUnit = int.Parse(addItemUnitTextBox.Text);
                if (count == 0) totalAmount = 0;
                else totalAmount = float.Parse(totalAmountTextBox.Text);
                productCode = addItemTextBox.Text;
                totalAmount = invoice.addItem(productCode, productUnit, totalAmount);
                totalAmountTextBox.Text = totalAmount.ToString();
                invoiceDataGridView = invoice.invoiceDataGridView(invoiceDataGridView);
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            
            count++;
        }

        private void updateProductPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void updateButton_Click(object sender, EventArgs e)
        {
            listPanel[3].Visible = false;
            listPanel[4].Visible = false;
            listPanel[5].Visible = false;

            shopManagerPanel.Dock = DockStyle.Fill;
            listPanel[2].Visible = true;
            listPanel[2].BringToFront();

            updateProductPanel.Size = new Size(700, 600);
            updateProductPanel.Dock = DockStyle.Right;
            listPanel[14].Visible = true;
            listPanel[14].BringToFront();

            Inventory inventoryObject = new Inventory();
            inventoryObject.showInventory(updateProductDataGridView);
        }

        private void button8_Click(object sender, EventArgs e)
        {
            Inventory inventoryObject = new Inventory();
            string code = addProductCodeTextBox.Text;
            string name = addProductNameTextBox.Text;
            string company = addProductCompanyTextBox.Text;
            float price = float.Parse(addProductPriceTextBox.Text);
            int unit = int.Parse(addProductUnitTextBox.Text);

            inventoryObject.addInventory(code, name, company, price, unit);
        }

        private void updateProductDataGridView_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            foreach (DataGridViewRow row in updateProductDataGridView.SelectedRows)
            {
                updateProductNameTextBox.Text = row.Cells[1].Value.ToString();
                updateProductCodeTextBox.Text = row.Cells[0].Value.ToString();
                updateCurrentPriceTextBox.Text = row.Cells[3].Value.ToString();
                updateAvailableUnitTextBox.Text = row.Cells[4].Value.ToString();
                updateProductNewPriceTextBox.Text = row.Cells[3].Value.ToString();
                updateArrivalUnitTextBox.Text = 0.ToString();
            }
        }

        private void updateProductButton_Click(object sender, EventArgs e)
        {
            Inventory inventoryObject = new Inventory();
            string code = updateProductCodeTextBox.Text;
            string pName = updateProductNameTextBox.Text;
            float nPrice =float.Parse(updateProductNewPriceTextBox.Text);
            int unit = int.Parse(updateAvailableUnitTextBox.Text);
            int nUnit = int.Parse(updateArrivalUnitTextBox.Text);
            inventoryObject.updateInventory(code, pName, nPrice, unit, nUnit);
            inventoryObject.showInventory(updateProductDataGridView);
        }

        private void userRegisterButton_Click(object sender, EventArgs e)
        {
            UserSubscription userObject = new UserSubscription();
            string userName;
            string userPassword;
            string userFullname;
            string userAddress;
            string userEmail;
            string userContact;
            userName = userNameTextBox.Text;
            userPassword = userPasswordTextBox.Text;
            userFullname = userFullNameTextBox.Text;
            userAddress = userAddressTextBox.Text;
            userEmail = userEmailTextBox.Text;
            userContact = userContactTextBox.Text;
            userObject.addUser(userName, userPassword, userFullname, userAddress, userEmail, userContact);
        }

        private void shopManagerLoginPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void managerLoginButton_Click(object sender, EventArgs e)
        {
            string mUserName = managerUserNameTextBox.Text;
            string mUserPassword = managerUserPasswordTextBox.Text;
            if (mUserName.Equals(managerUserName) && mUserPassword.Equals(managerUserPassword))
            {
                mUserName = null;
                mUserPassword = null;
                managerUserNameTextBox.Text = null;
                managerUserPasswordTextBox.Text = null;
                managerPanel.Dock = DockStyle.Fill;
                listPanel[7].Visible = true;
                listPanel[7].BringToFront();
            }
            else
            {
                MessageBox.Show("Check User Name or Password");
            }
        }

        private void pictureBox3_Click(object sender, EventArgs e)
        {

        }

        private void homePanel_Paint(object sender, PaintEventArgs e)
        {
            homePictureBox.Dock = DockStyle.Fill;
        }

        private void aboutPanel_Paint(object sender, PaintEventArgs e)
        {
            label37.BringToFront();
            label37.BackColor = System.Drawing.Color.Transparent;
            label38.BringToFront();
            label38.BackColor = System.Drawing.Color.Transparent;
            aboutPictureBox.Dock = DockStyle.Fill;
        }
    }
}
