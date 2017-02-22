/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shadhin
 */
public class UpdateData {

    String query;
    PreparedStatement ps;

    public void updateDonation(int donationId) {
        //query = "UPDATE DONATION SET BLOODAVAILABLE = 'NO' WHERE DONATIONID='"+donationId+"'";
        
        query = "BEGIN\n"
                + "	updateDonationProc('" + donationId + "');\n"
                + "END;";
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            ps = connection.prepareStatement(query);
            ps.executeQuery();
            //JOptionPane.showMessageDialog(null, "Assignment Successfull");
            //System.out.println("Executed Donation");
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception");
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void updateRequest(int requestId) {
        //query = "UPDATE REQUEST SET RAPPROVAL ='YES' WHERE REQUESTID ='"+requestId+"'";
        
        query = "BEGIN\n"
                + "	updateRequestProc('" + requestId + "');\n"
                + "END;";
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            ps = connection.prepareStatement(query);
            ps.executeQuery();
            //JOptionPane.showMessageDialog(null, "Assignment Successfull");
            //System.out.println("Executed Donation");
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception");
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    
    public void updateOperator(int operatorId) {
        //query = "UPDATE REQUEST SET RAPPROVAL ='YES' WHERE REQUESTID ='"+requestId+"'";
        
        query = "BEGIN\n"
                + "	updateOperatorProc('" + operatorId + "');\n"
                + "END;";
        
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            ps = connection.prepareStatement(query);
            ps.executeQuery();
            //JOptionPane.showMessageDialog(null, "Assignment Successfull");
            //System.out.println("Executed Donation");
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception");
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
