/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPanel;

import domain.DisplayData;
import domain.Donation;
import domain.Operator;
import domain.UpdateData;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Shadhin
 */
public class OperatorRequestApproval extends javax.swing.JPanel {

    /**
     * Creates new form OperatorRequest
     */
    public OperatorRequestApproval() {
        initComponents();
    }
    DefaultTableModel model;

    public void showOperatorRequest() {
        try {
            model.setRowCount(0);
        } catch (Exception e) {
        }

        DisplayData dd = new DisplayData();
        ArrayList<Operator> operator = dd.getOperatorList();
        model = (DefaultTableModel) operatorReqTable.getModel();
        Object[] row = new Object[12];
        for (int i = 0; i < operator.size(); i++) {
            row[0] = operator.get(i).getOperatorId();
            row[1] = operator.get(i).getUserName();
            row[2] = operator.get(i).getPassword();
            row[3] = operator.get(i).getoName();
            row[4] = operator.get(i).getoSex();
            row[5] = operator.get(i).getoBloodG();
            row[6] = operator.get(i).getoMobileN();
            row[7] = operator.get(i).getoEmail();
            row[8] = operator.get(i).getoAddress();
            row[9] = operator.get(i).getoAlternativeMN();
            row[10] = operator.get(i).getOperatorReqDate();
            row[11] = operator.get(i).getoApproval();
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        operatorReqTable = new javax.swing.JTable();
        oApprovalB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        operatorIdTF = new javax.swing.JTextField();
        oUserNameTF = new javax.swing.JTextField();
        oNameTF = new javax.swing.JTextField();
        oMobileNTF = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setMaximumSize(new java.awt.Dimension(700, 503));
        setMinimumSize(new java.awt.Dimension(700, 503));
        setPreferredSize(new java.awt.Dimension(700, 503));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Operator Id:");

        operatorReqTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        operatorReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "User Name", "Password", "Name", "Sex", "Bloog Group", "Mobile Number", "Email", "Address", "Alternative Mobile Number", "Date", "Approval"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        operatorReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                operatorReqTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(operatorReqTable);

        oApprovalB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oApprovalB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/approveButtonIcon.png"))); // NOI18N
        oApprovalB.setText("Approve");
        oApprovalB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oApprovalBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mobile Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Operator Request");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("User Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Name:");

        operatorIdTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        operatorIdTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorIdTFActionPerformed(evt);
            }
        });

        oUserNameTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oUserNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oUserNameTFActionPerformed(evt);
            }
        });

        oNameTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oNameTFActionPerformed(evt);
            }
        });

        oMobileNTF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oMobileNTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oMobileNTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(operatorIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(33, 33, 33)
                                        .addComponent(oUserNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(9, 9, 9)
                                        .addComponent(oMobileNTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oApprovalB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(operatorIdTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(oNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(oUserNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(oMobileNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))))
                    .addComponent(oApprovalB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void operatorIdTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operatorIdTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operatorIdTFActionPerformed

    private void oUserNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oUserNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oUserNameTFActionPerformed

    private void oNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oNameTFActionPerformed

    private void oMobileNTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oMobileNTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oMobileNTFActionPerformed

    private void operatorReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operatorReqTableMouseClicked
        // TODO add your handling code here:
        int i = operatorReqTable.getSelectedRow();
        TableModel model = operatorReqTable.getModel();
        operatorIdTF.setText(model.getValueAt(i, 0).toString());
        oUserNameTF.setText(model.getValueAt(i, 1).toString());
        oNameTF.setText(model.getValueAt(i, 3).toString());
        oMobileNTF.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_operatorReqTableMouseClicked

    private void oApprovalBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oApprovalBActionPerformed
        // TODO add your handling code here:
        UpdateData ud = new UpdateData();
        int opId = Integer.parseInt(operatorIdTF.getText());
        ud.updateOperator(opId);
        showOperatorRequest();
    }//GEN-LAST:event_oApprovalBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton oApprovalB;
    private javax.swing.JTextField oMobileNTF;
    private javax.swing.JTextField oNameTF;
    private javax.swing.JTextField oUserNameTF;
    private javax.swing.JTextField operatorIdTF;
    private javax.swing.JTable operatorReqTable;
    // End of variables declaration//GEN-END:variables
}
