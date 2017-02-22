/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;

import javax.swing.*;

/**
 *
 * @author Shadhin
 */
public class Img {  
        
        public Img() {  
            JFrame frame = new JFrame("Display Image");  
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      
            JPanel panel = (JPanel)frame.getContentPane();  
      
            JLabel label = new JLabel();  
            label.setIcon(new ImageIcon("myImage"));// your image here  
            panel.add(label);  
      
            frame.setLocationRelativeTo(null);  
            frame.pack();  
            frame.setVisible(true);  
        }  
      
        public static void main (String args[]) {  
            SwingUtilities.invokeLater(new Runnable() {  
                public void run() {  
                    new Img();  
                }  
            });  
        }  
     
}
