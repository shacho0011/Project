/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPanel;

import domain.DisplayData;
import domain.Donation;
import domain.Request;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shadhin
 */
public class RequestSearch extends javax.swing.JPanel {

    /**
     * Creates new form RequestSearch
     */
    public RequestSearch() {
        initComponents();

    }
    DisplayData dd = new DisplayData();
    ArrayList<Request> request = null;
    DefaultTableModel model;

    public void showDonor() {
        //model.setRowCount(0);
        try {
            model.setRowCount(0);
        } catch (Exception e) {
        }
        model = (DefaultTableModel) requestSearchT.getModel();
        Object[] row = new Object[10];
        for (int i = 0; i < request.size(); i++) {
            row[0] = request.get(i).getRequestId();
            row[1] = request.get(i).getrName();
            row[2] = request.get(i).getrSex();
            row[3] = request.get(i).getrBloodG();
            row[4] = request.get(i).getrMobileN();
            row[5] = request.get(i).getrEmail();
            row[6] = request.get(i).getrAddress();
            row[7] = request.get(i).getrAlternativeMN();
            row[8] = request.get(i).getRequestDate();
            row[9] = request.get(i).getrApproval();
            model.addRow(row);
        }
    }

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
        requestSearchTF = new javax.swing.JTextField();
        requestSearchB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestSearchT = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(700, 503));
        setMinimumSize(new java.awt.Dimension(700, 503));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Request Search");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mobile Number:");

        requestSearchTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        requestSearchB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requestSearchB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/searchButtonIcon.png"))); // NOI18N
        requestSearchB.setText("Search");
        requestSearchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestSearchBActionPerformed(evt);
            }
        });

        requestSearchT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        requestSearchT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Sex", "Blood Group", "Mobile Number", "Email", "Address", "Alternative Mobile Number", "Date", "Approval"
            }
        ));
        jScrollPane1.setViewportView(requestSearchT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(59, 59, 59)
                        .addComponent(requestSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(requestSearchB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(requestSearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requestSearchB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestSearchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestSearchBActionPerformed
        // TODO add your handling code here:
        String mobile = requestSearchTF.getText();
        DisplayData dd = new DisplayData();
        request = dd.getRequestList(mobile);
        if (request.isEmpty()) {
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "Sorry! Not a valid request");
        } else {
            showDonor();
        }


    }//GEN-LAST:event_requestSearchBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestSearchB;
    private javax.swing.JTable requestSearchT;
    private javax.swing.JTextField requestSearchTF;
    // End of variables declaration//GEN-END:variables
}
