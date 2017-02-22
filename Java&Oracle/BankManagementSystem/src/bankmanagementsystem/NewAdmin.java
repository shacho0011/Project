/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Shadhin
 */
public class NewAdmin extends JFrame{
    JPanel PAdmin=new JPanel();
    void newadmin() {
        JFrame Admin = new JFrame("Create New Admin");
        Admin.setBounds(0, 0, 500, 500);
        Admin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
        
        PAdmin.setLayout(null);
        PAdmin.setBounds(0, 0, 500, 500);
        PAdmin.setBackground(Color.CYAN);

        JLabel username = new JLabel("User Name:");
        username.setBounds(30, 100, 200, 30);
        final JTextField Username = new JTextField(); 
        Username.setBounds(150, 100, 200, 30);
        
   
        JLabel password = new JLabel("Password:");
        password.setBounds(30, 150, 200, 30);
        final JTextField Password = new JPasswordField();
        Password.setBounds(150, 150, 200, 30);
        
        JButton Login=new JButton("Create Admin");
        Login.setBounds(230, 200, 120, 30);
        
        /*Login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String UserName = "", PassWord = "";
                UserName = Username.getText();
                PassWord = Password.getText();
                if( UserName.equals(MUserName) && PassWord.equals(MPassWord)){
                    Menu menu = new Menu();
                    menu.MainFrame();
                }
            }
        });*/
        
        Admin.add(PAdmin);
        PAdmin.add(username);
        PAdmin.add(Username);
        PAdmin.add(password);
        PAdmin.add(Password);
        PAdmin.add(Login);
        Admin.show();
    }
    public JComponent getGUI() {
        return PAdmin;
    }
}
