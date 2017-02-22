/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankmanagementsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Prince
 */

public class LogIn extends JFrame {
    final String MUserName = "AS", MPassWord = "Bank";
    void AdminLogIn() {
            
        
        final JFrame Admin = new JFrame("Log In");
        Admin.setBounds(0, 0, 500, 500);
        Admin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        JPanel ADmin=new JPanel();
        ADmin.setLayout(null);
        ADmin.setBounds(0, 0, 500, 500);
        ADmin.setBackground(Color.CYAN);
       
        JLabel username;
        JLabel password;

        username=new JLabel("User Name:");
        username.setBounds(30, 100, 200, 30);
        final JTextField Username=new JTextField(); 
        Username.setBounds(150, 100, 200, 30);
        
   
        password=new JLabel("Password :");
        password.setBounds(30, 150, 200, 30);
        final JTextField Password = new JPasswordField();
        Password.setBounds(150, 150, 200, 30);
        
        JButton Login=new JButton("LogIn");
        Login.setBounds(250, 200,100, 30);

        Login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String UserName = "", PassWord = "";
                UserName = Username.getText();
                PassWord = Password.getText();
                if( UserName.equals(MUserName) && PassWord.equals(MPassWord)){
                    Menu menu = new Menu();
                    menu.MainFrame();
                    Admin.show(false);
                }
            }
        });
        
        //JTextField alin=new JTextField("Admin Log In");
        //alin.setLocation(30, 50);
        //alin.setVisible(true);
        Admin.add(ADmin);
        ADmin.add(username);
        ADmin.add(Username);
        ADmin.add(password);
        ADmin.add(Password);
        ADmin.add(Login);
        Admin.show();
    }
}
