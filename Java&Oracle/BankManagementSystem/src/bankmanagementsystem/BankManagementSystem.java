/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;

import javax.swing.JFrame;

/**
 *
 * @author Shadhin
 */
public class BankManagementSystem extends JFrame{
    public static void main(String[] args) {
        //Menu menu = new Menu();
        LogIn login=new LogIn();
        //menu.MainFrame();
        login.AdminLogIn();
        login.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Calander calander = new Calander();
        //calander.calander();
    }
}