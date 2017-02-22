using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BloodBankManagementSystem
{
    public partial class Form1 : Form
    {
        string userName = "admin";
        string userPassword = "admin";
        Boolean signin = false;
        /*Image backgrounImage = new Bitmap(@"E:","Education","3.2","SD","BloodBankManagementSystem","BloodBankManagementSystem","Resources");*/
        List<Panel> listPanel = new List<Panel>();
        public Form1()
        {
            InitializeComponent();
            timer.Start();
            signinUserPasswordTextBox.PasswordChar = '*';
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            listPanel.Add(homeSigninPanel);
            listPanel.Add(homePanel);
            listPanel.Add(searchBloodPanel);
            listPanel.Add(searchDonorPanel);
            listPanel.Add(donorRegistrationPanel);
            listPanel.Add(donateBloodPanel);
            listPanel.Add(requestBloodPanel);
            listPanel.Add(requestApprovalPanel);
            listPanel.Add(bloodAssignmentPanel);
            listPanel.Add(bloodBankPanel);
            listPanel.Add(aboutPanel);
            listPanel.Add(updateDonorInfoPanel);

            listPanel[0].Visible = true;
            listPanel[0].Dock = DockStyle.Fill;
            listPanel[0].BringToFront();

        }

        private void clintToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void exitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            signin = false;
            Application.Exit();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            DateTime dateTime = DateTime.Now;
            this.timerLabel.Text = dateTime.ToString();
        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void homeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                homePictureBox.Dock = DockStyle.Fill;
                listPanel[0].Visible = false;
                listPanel[1].Visible = true;
                listPanel[1].Dock = DockStyle.Fill;
                listPanel[1].BringToFront();
            }
            else if(!signin)
            {
                listPanel[1].Visible = false;
                listPanel[0].Visible = true;
                listPanel[0].Dock = DockStyle.Fill;
                listPanel[0].BringToFront();
            }
            
        }

        private void signinButton_Click(object sender, EventArgs e)
        {
            if (!signin)
            {
                string uName = signinUserPasswordTextBox.Text;
                string uPassword = signinUserNameTextBox.Text;
                if (uName.Equals(userName) && uPassword.Equals(userPassword))
                {
                    signin = true;
                    homePictureBox.Dock = DockStyle.Fill;
                    listPanel[0].Visible = false;
                    listPanel[1].Visible = true;
                    listPanel[1].Dock = DockStyle.Fill;
                    listPanel[1].BringToFront();
                    signinUserPasswordTextBox.Text = null;
                    signinUserNameTextBox.Text = null;
                }
                else
                {
                    signin = false;
                    MessageBox.Show("Check User Name or User Password");
                    signinUserNameTextBox.Text = null;
                }
            }
        }

        private void logoutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                signin = false;
                MessageBox.Show("Signout");
                listPanel[1].Visible = false;
                listPanel[0].Visible = true;
                listPanel[0].Dock = DockStyle.Fill;
                listPanel[0].BringToFront();
            }
            else if(!signin)
            {
                MessageBox.Show("Please Signin first or no User");
                listPanel[1].Visible = false;
                listPanel[0].Visible = true;
                listPanel[0].Dock = DockStyle.Fill;
                listPanel[0].BringToFront();
            }
            
        }

        private void bloodToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                //this.BackgroundImage = backgrounImage;
                //this.BackgroundImageLayout = ImageLayout.Stretch;
                searchBloodGroupBox.Dock = DockStyle.Top;
                listPanel[3].Visible = false;
                listPanel[2].Visible = true;
                listPanel[2].Dock = DockStyle.Fill;
                listPanel[2].BringToFront();
            }
        }

        private void donorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                //this.BackgroundImage = backgrounImage;
                //this.BackgroundImageLayout = ImageLayout.Stretch;
                searchDonorGroupBox.Dock = DockStyle.Top;
                listPanel[2].Visible = false;
                listPanel[3].Visible = true;
                listPanel[3].Dock = DockStyle.Fill;
                listPanel[3].BringToFront();
            }
        }

        private void donorRegistrationToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                donorRegistrationGroupBox.Dock = DockStyle.Left;
                listPanel[5].Visible = false;
                listPanel[6].Visible = false;
                listPanel[11].Visible = false;
                listPanel[4].Visible = true;
                listPanel[4].Dock = DockStyle.Fill;
                listPanel[4].BringToFront();
            }
        }

        private void donatBloodToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                donateBloodGroupBox.Dock = DockStyle.Left;
                listPanel[4].Visible = false;
                listPanel[6].Visible = false;
                listPanel[11].Visible = false;
                listPanel[5].Visible = true;
                listPanel[5].Dock = DockStyle.Fill;
                listPanel[5].BringToFront();
            }
        }

        private void requestToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                requestBloodGroupBox.Dock = DockStyle.Left;
                listPanel[4].Visible = false;
                listPanel[5].Visible = false;
                listPanel[11].Visible = false;
                listPanel[6].Visible = true;
                listPanel[6].Dock = DockStyle.Fill;
                listPanel[6].BringToFront();
            }
        }

        private void requestApprovalToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                requestGroupBox.Dock = DockStyle.Fill;
                requestInner1GroupBox.Dock = DockStyle.Top;
                requestInner2GroupBox.Dock = DockStyle.Fill;
                requestedDataGridView.Dock = DockStyle.Fill;
                listPanel[8].Visible = false;
                listPanel[9].Visible = false;
                listPanel[7].Visible = true;
                listPanel[7].Dock = DockStyle.Fill;
                listPanel[7].BringToFront();

                Management managementObject = new Management();
                requestedDataGridView = managementObject.showRequestInfo(requestedDataGridView);

            }
        }

        private void bloodAssignmentToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                bloodAssignmentGroupBox.Dock = DockStyle.Fill;
                bloodAssignmentInner1GroupBox.Dock = DockStyle.Top;
                bloodAssignmentInner2GroupBox.Dock = DockStyle.Fill;
                bloodAssignmentDataGridView.Dock = DockStyle.Fill;
                listPanel[7].Visible = false;
                listPanel[9].Visible = false;
                listPanel[8].Visible = true;
                listPanel[8].Dock = DockStyle.Fill;
                listPanel[8].BringToFront();

                Management managementObject = new Management();
                bloodAssignmentDataGridView = managementObject.showAssignInfo(bloodAssignmentDataGridView);

            }
        }

        private void bloodBankToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                bloodBankGroupBox.Dock = DockStyle.Fill;
                bloodBankInner1GroupBox.Dock = DockStyle.Top;
                bloodBankInner2GroupBox.Dock = DockStyle.Fill;
                bloodBankDataGridView.Dock = DockStyle.Fill;
                listPanel[7].Visible = false;
                listPanel[8].Visible = false;
                listPanel[9].Visible = true;
                listPanel[9].Dock = DockStyle.Fill;
                listPanel[9].BringToFront();

                Management managementObject = new Management();
                bloodBankDataGridView = managementObject.showDonationInfo(bloodBankDataGridView);

            }
        }

        private void aboutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                aboutPictureBox.Dock = DockStyle.Fill;
                listPanel[10].Visible = true;
                listPanel[10].Dock = DockStyle.Fill;
                listPanel[10].BringToFront();
            }
        }

        private void donorRegistrationButton_Click(object sender, EventArgs e)
        {
            Clint clintObject = new Clint();
            string mobileNumber = donorMobileNumberTextBox.Text;
            string name = donorNameTextBox.Text;
            string bloodGroup = donorBloodGroupComboBox.Text;
            string sex = donorSexComboBox.Text;
            string address = donorAddressTextBox.Text;
            string email = donorEmailTextBox.Text;
            string alternateMNumber = donorAltrnateMNumberTextBox.Text;

            clintObject.insertIntoDonorInfo(mobileNumber, name, bloodGroup, sex, address, email, alternateMNumber);

            donorMobileNumberTextBox.Text = null;
            donorNameTextBox.Text = null;
            donorBloodGroupComboBox.Text = null;
            donorSexComboBox.Text = null;
            donorAddressTextBox.Text = null;
            donorEmailTextBox.Text = null;
            donorAltrnateMNumberTextBox.Text = null;
        }

        private void donateBloodButton_Click(object sender, EventArgs e)
        {
            Clint clintObject = new Clint();
            string mobileNumber = donateBloodMobileNumberTextBox.Text;
            string bloodGroup = donateBloodComboBox.Text;

            if (clintObject.checkDonor(mobileNumber, bloodGroup))
            {
                if (clintObject.checkDate(mobileNumber, bloodGroup))
                {
                    clintObject.insertIntoDonationInfo(mobileNumber, bloodGroup);
                }
                else
                {
                    DateTime validDate = clintObject.returnValidDate(mobileNumber, bloodGroup);
                    MessageBox.Show("Minimum 90 days after last donation\nYour next step start from: " + validDate);
                }
            }
            else MessageBox.Show("Please register first");
        }

        private void requestSubmitButton_Click(object sender, EventArgs e)
        {
            Clint clintObject = new Clint();
            string name = requestNameTextBox.Text;
            string mobileNumber = requestMobileNumberTextBox.Text;
            string bloodGroup = requestBloodGroupComboBox.Text;
            string sex = requestSexComboBox.Text;
            string address = requestAddressTextBox.Text;
            string email = requestEmailTextBox.Text;
            clintObject.insertIntoRequestInfo(name, mobileNumber, bloodGroup, sex, address, email);
        }

        private void label10_Click(object sender, EventArgs e)
        {

        }

        private void requestSortButton_Click(object sender, EventArgs e)
        {
            Management managementObject = new Management();
            string sortOrder = requestSortComboBox.Text;
            requestedDataGridView = managementObject.showCustomRequestInfo(requestedDataGridView, sortOrder);

        }

        private void requestApprovalButton_Click(object sender, EventArgs e)
        {
            Management managementObject = new Management();
            int donationId = 0;
            int requestCode = int.Parse(requestedCodeTextBox.Text);
            string requestedBloodGroup = managementObject.bloodGroupPicker(requestCode);

            donationId = managementObject.donorPicker(requestedBloodGroup);
            if (donationId == 0)
            {
                MessageBox.Show("No donor found");
            }
            else
            {
                managementObject.insertIntoAssignInfo(requestCode, donationId, requestedBloodGroup);
                managementObject.updateDonationInfo(donationId);
                managementObject.updateRequestInfo(requestCode);
                requestedDataGridView = managementObject.showRequestInfo(requestedDataGridView);

            }

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void bloodAssignmentDataGridView_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            foreach (DataGridViewRow row in bloodAssignmentDataGridView.SelectedRows)
            {
                detailRequestCodeTextBox.Text = row.Cells[1].Value.ToString();
                detailDonationIdTextBox.Text = row.Cells[2].Value.ToString();

            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Management managementObject = new Management();
            
            int requestCode = int.Parse(detailRequestCodeTextBox.Text);
            int donationId = int.Parse(detailDonationIdTextBox.Text);
            string mNumber = managementObject.donorMobileNumberPicker(donationId);
            string donorName = managementObject.donorNamePicker(mNumber);

            detailDonorNameTextBox.Text = donorName;
            detailDonorMobileNumberTextBox.Text = mNumber;

            managementObject = managementObject.requesterPicker(requestCode);
            detailRequesterNameTextBox.Text = managementObject.name;
            detailRequesterMobileNumberTextBox.Text = managementObject.mobileNumber;

        }

        private void bloodBankGroupByButton_Click(object sender, EventArgs e)
        {
            Management managementObject = new Management();
            string groupBy = bloodBankGroupByComboBox.Text;

            bloodBankDataGridView = managementObject.showCustomDonationInfo(bloodBankDataGridView, groupBy);
        }

        private void searchBloodButton_Click(object sender, EventArgs e)
        {
            Search searchObject = new Search();
            string searchBlood = searchBloodGroupComboBox.Text;
            searchBloodDataGridView = searchObject.showSearchBlood(searchBloodDataGridView, searchBlood);
            searchDonorResultGroupBox.Visible = false;
            searchBloodResultGroupBox.Dock = DockStyle.Fill;
            searchBloodResultGroupBox.Visible = true;
            searchBloodResultGroupBox.BringToFront();
        }

        private void searchDonorButton_Click(object sender, EventArgs e)
        {
            Search searchObject = new Search();
            string searchMNumber = searchDonorMobileNumberTextBox.Text;
            searchBloodResultGroupBox.Visible = false;
            searchDonorResultGroupBox.Dock = DockStyle.Fill;
            searchDonorResultGroupBox.Visible = true;
            searchDonorResultGroupBox.BringToFront();
            searchDonorDataGridView = searchObject.showSearchDonor(searchDonorDataGridView, searchMNumber);
        }

        private void requestDataGridView_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            
        }

        private void requestedDataGridView_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            requestedDataGridView.SelectionMode = DataGridViewSelectionMode.FullRowSelect;
            foreach (DataGridViewRow row in requestedDataGridView.SelectedRows)
            {
                requestedCodeTextBox.Text = row.Cells["RequestCode"].Value.ToString();

            }
        }

        private void updateDonorInfoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (signin)
            {
                donorRegistrationGroupBox.Dock = DockStyle.Fill;
                listPanel[4].Visible = false;
                listPanel[5].Visible = false;
                listPanel[6].Visible = false;
                updateDonorInfoEditGroupBox.Dock = DockStyle.Top;
                updateDonorInfoDataViewGroupBox.Dock = DockStyle.Fill;
                donorInfoDataGridView.Dock = DockStyle.Fill;
                listPanel[11].Visible = true;
                listPanel[11].Dock = DockStyle.Fill;
                listPanel[11].BringToFront();

                Clint clintObject = new Clint();
                donorInfoDataGridView = clintObject.showDonorInfo(donorInfoDataGridView);
            }
        }

        private void donorInfoDataGridView_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            foreach (DataGridViewRow row in donorInfoDataGridView.SelectedRows)
            {
                updateMobileNumberTextBox.Text = row.Cells[0].Value.ToString();
                updateNameTextBox.Text = row.Cells[1].Value.ToString();
                updateBloodGroupComboBox.Text = row.Cells[2].Value.ToString();
                updateSexComboBox.Text = row.Cells[3].Value.ToString();
                updateAddressTextBox.Text = row.Cells[4].Value.ToString();
                updateEmailTextBox.Text = row.Cells[5].Value.ToString();
                updateAlternateMNumberTextBox.Text = row.Cells[6].Value.ToString();
            }

        }

        private void updateDonorInfoButton_Click(object sender, EventArgs e)
        {
            string mobileNumber = updateMobileNumberTextBox.Text;
            string name = updateNameTextBox.Text;
            string address = updateAddressTextBox.Text;
            string email = updateEmailTextBox.Text;
            string alternateMNumber = updateAlternateMNumberTextBox.Text;
            Clint clintObject = new Clint();
            clintObject.updateDonationInfo(mobileNumber, name, address, email, alternateMNumber);
            donorInfoDataGridView = clintObject.showDonorInfo(donorInfoDataGridView);
        }

        private void updateNameTextBox_TextChanged(object sender, EventArgs e)
        {

        }

        private void headerPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void aboutPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void searchBloodPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void donateBloodPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void updateDonorInfoPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void donorRegistrationPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void homePanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void searchDonorPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void bloodBankPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void bloodAssignmentPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void requestApprovalPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void requestBloodPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void homeSigninPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        private void footerPanel_Paint(object sender, PaintEventArgs e)
        {

        }

        
    }
}
