/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPanel;

import domain.Donation;
import domain.Donor;
import domain.InsertData;
import domain.RetrieveData;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Shadhin
 */
public class DonateBlood extends javax.swing.JPanel {

    /**
     * Creates new form DonateBlood
     */
    public DonateBlood() {
        initComponents();
        donateMobileNCB.setSelectedIndex(0);
    }
    String donateMobileN;
    String donateBloodG;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        donateMobileNTF = new javax.swing.JTextField();
        donateMobileNCB = new javax.swing.JComboBox<>();
        donateB = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setMaximumSize(new java.awt.Dimension(700, 503));
        setMinimumSize(new java.awt.Dimension(700, 503));
        setPreferredSize(new java.awt.Dimension(700, 503));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Donate Blood");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mobile Number:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Blood Group:");

        donateMobileNTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        donateMobileNCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        donateMobileNCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        donateB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        donateB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/submitButton.png"))); // NOI18N
        donateB.setText("Donate");
        donateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(donateMobileNTF)
                                    .addComponent(donateMobileNCB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(donateB)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(donateMobileNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(donateMobileNCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(donateB)
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void donateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateBActionPerformed
        // TODO add your handling code here:
        donateMobileN = donateMobileNTF.getText();
        donateBloodG = donateMobileNCB.getSelectedItem().toString();

        try {
            RetrieveData rd = new RetrieveData();
            Date donationDate = null;
            String bloodG = null;
            ArrayList<Donor> donorList;
            if (!rd.getDonorId(donateMobileN).isEmpty()) {
                int donorId = 0;
                donorList = rd.getDonorId(donateMobileN);
                donorId = donorList.get(0).getDonorId();
                System.out.println("Donor Id: " + donorId);
                ArrayList<Donation> donation;
                int diff = 121;
                if (!rd.getDonationDate(donorId).isEmpty()) {
                    donation = rd.getDonationDate(donorId);

                    for (int i = 0; i < donation.size(); i++) {
                        donationDate = donation.get(i).getDonationDate();
                        bloodG = donation.get(i).getdBloodG();
                    }
                    System.out.println("Donation Date: " + donationDate);
                    System.out.println("Donor Blood Group: " + bloodG);
                    Date today = new Date();
                    long difference = today.getTime() - donationDate.getTime();
                    diff = (int) (difference / (1000 * 60 * 60 * 24));
                }
                //System.out.println("ID: " + donorId);

                if (bloodG.equals(donateBloodG)) {
                    if (diff > 120) {
                        InsertData id = new InsertData();
                        id.insertDonation(donateMobileN, donateBloodG);
                        JOptionPane.showMessageDialog(null, "Donation Successfull");
                    } else {
                        int after = 120 - diff;
                        JOptionPane.showMessageDialog(null, "You can donate after " + after + " days\nLast Donation Date: " + donationDate);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Blood group mismatch");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Register First!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_donateBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donateB;
    private javax.swing.JComboBox<String> donateMobileNCB;
    private javax.swing.JTextField donateMobileNTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}