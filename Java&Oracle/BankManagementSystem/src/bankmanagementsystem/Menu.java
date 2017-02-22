/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 *
 * @author Shadhin
 */
public class Menu extends JFrame{
    void MainFrame(){
        final NewAdmin Wnewadmin = new NewAdmin();
        final CreateAccount createaccount = new CreateAccount();
        final Transection TBT = new Transection();
        final Transection TBB = new Transection();
        final Search Wsearch = new Search();
        
    JFrame MenuFrame = new JFrame("HSBC");
    
    JMenuBar menubar = new JMenuBar();
    JMenu adminmenu = new JMenu("Admin");
    menubar.add(adminmenu);
    JMenuItem NewAdmin = new JMenuItem("New Admin");
    adminmenu.add(NewAdmin);
    
    NewAdmin.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Wnewadmin.newadmin();
            /*Wnewadmin.show(true);
            createaccount.show(false);
            TBT.show(false);
            TBB.show(false);
            Wsearch.show(false);*/
        }
    });
    
    JMenu applicationmenu = new JMenu("Create Account");
    menubar.add(applicationmenu);
    JMenuItem NewForm = new JMenuItem("New Form");
    applicationmenu.add(NewForm);
    
    NewForm.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            createaccount.applicationform();
            /*Wnewadmin.show(false);
            createaccount.show(true);
            TBT.show(false);
            TBB.show(false);
            Wsearch.show(false);*/
        }
    });

    JMenu transactionmenu = new JMenu("Transaction");
    menubar.add(transactionmenu);
    JMenuItem TransferBalance = new JMenuItem("Transfer Balance");
    JMenuItem Balance = new JMenuItem("Balance");
    transactionmenu.add(TransferBalance);
    transactionmenu.add(Balance);

    TransferBalance.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            TBT.transfer();
            /*Wnewadmin.show(false);
            createaccount.show(false);
            TBT.show(true);
            TBB.show(false);
            Wsearch.show(false);*/
        }
    });
    
    Balance.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            TBB.balance();
            /*Wnewadmin.show(false);
            createaccount.show(false);
            TBT.show(false);
            TBB.show(true);
            Wsearch.show(false);*/
        }
    });

    JMenu recordsmenu = new JMenu("Records");
    menubar.add(recordsmenu);
    JMenuItem ShowRecords = new JMenuItem("Show Records");
    recordsmenu.add(ShowRecords);
    

    JMenu searchmenu = new JMenu("Search");
    menubar.add(searchmenu);
    JMenuItem Search = new JMenuItem("Search Account");
    searchmenu.add(Search);
    Search.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            Wsearch.Search();
            /*Wnewadmin.show(false);
            createaccount.show(false);
            TBT.show(false);
            TBB.show(false);
            Wsearch.show(true);*/
        }
    });
    
    JMenu helpmenu = new JMenu("Help");
    menubar.add(helpmenu);
 
    MenuFrame.setJMenuBar(menubar);
    MenuFrame.setBounds(0, 0, 500, 500);
    MenuFrame.setBackground(Color.CYAN);
    

    /*MenuFrame.add(Wnewadmin);
    MenuFrame.add(createaccount);
    MenuFrame.add(TB);
    MenuFrame.add(Wsearch);*/
    
    //Wnewadmin.newadmin();
    MenuFrame.add(Wnewadmin.getGUI());
    
    //createaccount.applicationform();
    MenuFrame.add(createaccount.getGUI());
    
    //TB.transfer();
    //TB.balance();
    MenuFrame.add(TBT.getGUI());
    MenuFrame.add(TBB.getGUI());
    
    //Wsearch.Search();
    MenuFrame.add(Wsearch.getGUI());
    
    MenuFrame.pack();
    
    MenuFrame.setVisible(true);
    MenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
