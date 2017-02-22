/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Rafi
 */
public class Search extends JFrame{
    JPanel PSearch = new JPanel();
    void Search(){
        JFrame Search = new JFrame("Search Account");
        Search.setBounds(0, 0, 500, 500);
        Search.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        PSearch.setBounds(0, 0, 500, 500);
        PSearch.setBackground(Color.CYAN);
        PSearch.setLayout(null);
        
        
        //JPanel panel = (JPanel)Search.getContentPane();  
      
        //JLabel label = new JLabel();
        //label.setIcon(new ImageIcon("J:\\Java\\HSBC\\use\\search.png"));
        JLabel Image = new JLabel();
        Image.setIcon(new javax.swing.ImageIcon("J:\\Java\\HSBC\\use\\search.png"));
        Image.setBounds(0, 0, 500, 500);
        JLabel LSearch = new JLabel("Account No: ");
        LSearch.setBounds(50, 120, 200, 30);
        
        final JTextField TSearch = new JTextField();
        TSearch.setBounds(150, 120, 200, 30);
        
        JButton BSearch = new JButton("Search");
        BSearch.setBounds(150, 200, 100, 30);
        BSearch.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            DataBase data = new DataBase();
            data.Search(TSearch.getText());
        }
    });
        
        PSearch.add(LSearch);
        PSearch.add(Image);
        //PSearch.add(label);
        PSearch.add(TSearch);
        PSearch.add(BSearch);
        
        //Search.add(panel);
        Search.add(PSearch);
        //Search.setLocationRelativeTo(null);  
        //Search.pack();
        Search.show(true);
        /*SwingUtilities.invokeLater(new Runnable() {  
                public void run() {  
                    new Img();  
                }
         });*/
    }
    public JComponent getGUI() {
        return PSearch;
    }
}
