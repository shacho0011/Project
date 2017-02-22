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
public class InsertData {

    String query;
    PreparedStatement ps;

    public void insertRequest(String mobile, String name, String sex, String bloodG, String email, String address, String alternativeMN) {
        query = "BEGIN\n"
                + "   insertRequestProc('" + mobile + "','" + name + "','" + bloodG + "','" + sex + "','" + address + "','" + email + "','" + alternativeMN + "');\n"
                + "END;";
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            ps = connection.prepareStatement(query);
            ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Operation Successful");
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertDonor(String mobile, String name, String sex, String bloodG, String email, String address, String alternativeMN) {
        query = "BEGIN\n"
                + "   insertDonorProc('" + mobile + "','" + name + "','" + bloodG + "','" + sex + "','" + address + "','" + email + "','" + alternativeMN + "');\n"
                + "END;";
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            ps = connection.prepareStatement(query);
            ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Registration Successful");
            insertDonation(mobile, bloodG);
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertOperator(String mobile, String name, String sex, String bloodG, String email, String address, String alternativeMN, String password) {
        query = "BEGIN\n"
                + "   insertOperatorProc('" + email + "','" + password + "','" + mobile + "','" + name + "','" + bloodG + "','" + sex + "','" + address + "','" + alternativeMN + "');\n"
                + "END;";
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            ps = connection.prepareStatement(query);
            ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Operation Successful");
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertDonation(String mobile, String bloodG) {
        query = "BEGIN\n"
                + "   insertDonationProc('" + mobile + "','" + bloodG + "');\n"
                + "END;";
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            ps = connection.prepareStatement(query);
            ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Donation Successful");
            System.out.println("Executed Donation");
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Donar Does Not Exist!\nRegister First");
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertBloodAssignment(int donationId, int requestId, String bloodG) {
        query = "BEGIN\n"
                + "   insertBloodAssignmentProc('" + donationId + "','" + requestId + "','" + bloodG + "');\n"
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
