/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Shadhin
 */
public class RetrieveData {

    String query;
    Statement stmt;
    ResultSet rs;
    CallableStatement cstmt;

    public ArrayList<Donation> getDonationId(String bloodG) {
        query = "{? = call getDonationIdFunc(?,?)}";
        ArrayList<Donation> bloodList = new ArrayList<Donation>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, bloodG);
            cstmt.setString(3, "YES");
            
            boolean hasResult = cstmt.execute();
            //System.out.println("" + hasResult);
            rs = (ResultSet) cstmt.getObject(1);
            Donation donation;
            if (rs != null) {
                rs.next();
                donation = new Donation(rs.getInt("DonationID"), rs.getInt("DonorID"));
                bloodList.add(donation);
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bloodList;
    }

    public ArrayList<Donor> getDonorId(String mobile) {
        query = "{? = call getDonorFunc(?)}";
        ArrayList<Donor> donorList = new ArrayList<Donor>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, mobile);
            //cstmt.setString(3, blood);
            boolean hasResult = cstmt.execute();
            System.out.println("" + hasResult);
            rs = (ResultSet) cstmt.getObject(1);
            Donor donor;
            if (rs != null) {
                rs.next();
                donor = new Donor(rs.getInt("DonorID"),rs.getString("DBLOODG"));
                donorList.add(donor);

            }
            cstmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donorList;
    }

    public ArrayList<Donation> getDonationDate(int donorId) {
        query = "{? = call getDonationDateFunc(?)}";
        ArrayList<Donation> donationList = new ArrayList<Donation>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setInt(2, donorId);
            //cstmt.setString(3, "YES");
            boolean hasResult = cstmt.execute();
            System.out.println("" + hasResult);
            rs = (ResultSet) cstmt.getObject(1);
            Donation donation;
            if (rs != null) {
                while (rs.next()) {
                    donation = new Donation(rs.getDate("DONATIONDATE"), rs.getString("DBloodG"));
                    donationList.add(donation);
                }

            }

            cstmt.close();
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donationList;
    }
    
    
    public ArrayList<Operator> getAuthentication(String userName) {
        query = "{? = call getUserPasswordFunc(?)}";
        ArrayList<Operator> operatorPassw = new ArrayList<Operator>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, userName);
            
            
            boolean hasResult = cstmt.execute();
            //System.out.println("" + hasResult);
            rs = (ResultSet) cstmt.getObject(1);
            Operator operator;
            if (rs != null) {
                rs.next();
                operator = new Operator(rs.getString("OPassword"));
                operatorPassw.add(operator);
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return operatorPassw;
    }

}
