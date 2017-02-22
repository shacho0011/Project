/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPanel;

import view.MainFrame;
import domain.Operator;
import domain.RetrieveData;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Shadhin
 */
public class SignIn extends javax.swing.JPanel {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userNameTF = new javax.swing.JTextField();
        passwordPF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        signINB = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(700, 479));

        jLabel3.setText("Icon");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("User Name:");

        userNameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        passwordPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password:");

        signINB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signINB.setText("Sign In");
        signINB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signINBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signINB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(passwordPF))))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordPF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(signINB)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void signINBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signINBActionPerformed
        // TODO add your handling code here:
        String userName = userNameTF.getText();
        String password = passwordPF.getText();
        RetrieveData rd = new RetrieveData();
        ArrayList<Operator> op = new ArrayList<Operator>();
        if(!rd.getAuthentication(userName).isEmpty()){
            op = rd.getAuthentication(userName);
            String retPassW = op.get(0).getPassword();
            if(retPassW.equals(password)){
                //MainFrame mf = new MainFrame(1);
                //mf.setAccessLimit(1);
                //System.out.println("GetLimit: "+mf.getAccessLimit());
                //PrevilageClass pc = new PrevilageClass(1);
                //JOptionPane.showMessageDialog(null, "Welcome!!!!");
                //About ab = new About();
                //ab.setVisible(true);
                setVisible(false);
                
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Password");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Invalid User Name");
        }
        
    }//GEN-LAST:event_signINBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JButton signINB;
    private javax.swing.JTextField userNameTF;
    // End of variables declaration//GEN-END:variables
}