/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Shadhin
 */
public class ExceptionMessage extends JFrame{
    JFrame Exception = new JFrame();
    
    void forString(){
        JPanel forString = new JPanel();
        forString.setBounds(0, 0, 300, 100);
        forString.setBackground(Color.red);
        forString.setLayout(null);
        JLabel Message = new JLabel("Should not enter Number!");
        Message.setBounds(75, 20, 150, 20);
        JButton OK = new JButton("OK");
        OK.setBounds(120, 60, 60, 30);
        
        OK.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Exception.show(false);
            }
        });
        
        forString.add(OK);
        forString.add(Message);
        Exception.setBounds(0, 0, 300, 150);
        Exception.add(forString);
        Exception.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Exception.show();
    }
    
    void forNumber(){
        JPanel forNumber = new JPanel();
        forNumber.setBounds(0, 0, 300, 100);
        forNumber.setBackground(Color.red);
        forNumber.setLayout(null);
        JLabel Message = new JLabel("Should not enter String!");
        Message.setBounds(75, 20, 150, 20);
        JButton OK = new JButton("OK");
        OK.setBounds(120, 60, 60, 30);
        
        OK.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Exception.show(false);
            }
        });
        
        forNumber.add(OK);
        forNumber.add(Message);
        Exception.setBounds(0, 0, 300, 150);
        Exception.add(forNumber);
        Exception.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Exception.show();
    }
}
