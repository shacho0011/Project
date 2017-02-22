/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Shadhin
 */
public class Transection extends JFrame{
    JFrame Transection = new JFrame("Transection");
    JPanel PTransfer = new JPanel();
    void transfer(){
       Transection.setBounds(0,0, 500, 500);
       Transection.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       
       PTransfer.setLayout(null);
       PTransfer.setBounds(0, 0, 500, 500);
       PTransfer.setBackground(Color.CYAN);
       
       JLabel LFrom = new JLabel("From");
       LFrom.setBounds(30, 50, 200, 30);
       JLabel LAccount = new JLabel("Account No.: ");
       LAccount.setBounds(60, 100, 200, 30);
       JTextField TAccount = new JTextField(); 
       TAccount.setBounds(180, 100, 200, 30);
       
       JLabel LTo = new JLabel("To");
       LTo.setBounds(30, 150, 200, 30);
       JLabel LAccountT = new JLabel("Account No.: ");
       LAccountT.setBounds(60, 200, 200, 30);
       JTextField TAccountT = new JTextField(); 
       TAccountT.setBounds(180, 200, 200, 30);
       
       JLabel LAmount=new JLabel("Amount: ");
       LAmount.setBounds(60, 300, 200, 30);
       JTextField TAmount = new JTextField();
       TAmount.setBounds(180, 300, 200, 30);
       
       JButton BTransfer = new JButton("Transfer Balance");
       BTransfer.setBounds(245, 350, 135, 30);
       
       PTransfer.add(LFrom);
       PTransfer.add(LAccount);
       PTransfer.add(TAccount);
       PTransfer.add(LAmount);
       PTransfer.add(TAmount);
       PTransfer.add(LTo);
       PTransfer.add(LAccountT);
       PTransfer.add(TAccountT);
       PTransfer.add(BTransfer);
       Transection.add(PTransfer);
       Transection.show();
       
    }
    
    void balance(){
       Transection.setBounds(0,0, 500, 500);
       Transection.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
       PTransfer.setLayout(null);
       PTransfer.setBounds(0, 0, 500, 500);
       PTransfer.setBackground(Color.CYAN);
       
       JLabel LAccount = new JLabel("Account No.: ");
       LAccount.setBounds(30, 100, 200, 30);
       JTextField TAccount = new JTextField(); 
       TAccount.setBounds(150, 100, 200, 30);
        
       JLabel LAmount=new JLabel("Amount: ");
       LAmount.setBounds(30, 150, 200, 30);
       JTextField TAmount = new JTextField();
       TAmount.setBounds(150, 150, 200, 30);
       
       JButton BTransfer = new JButton("Balance");
       BTransfer.setBounds(250, 200, 100, 30);
       
       PTransfer.add(LAccount);
       PTransfer.add(TAccount);
       PTransfer.add(LAmount);
       PTransfer.add(TAmount);
       PTransfer.add(BTransfer);
       Transection.add(PTransfer);
       Transection.show();
    }
    public JComponent getGUI() {
        return PTransfer;
    }
}
