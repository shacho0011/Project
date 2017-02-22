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
public class DisplayData {

    String query;
    Statement stmt;
    ResultSet rs;
    CallableStatement cstmt;

    public ArrayList<Request> getRequestList() {
        query = "{? = call getRequestListFunc}";
        ArrayList<Request> requestList = new ArrayList<Request>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            //cstmt.setString(2, mobile);
            boolean hasResult = cstmt.execute();
            System.out.println("" + hasResult);
            rs = (ResultSet) cstmt.getObject(1);
            Request req;
            while (rs.next()) {
                req = new Request(rs.getInt("RequestId"), rs.getString("RName"),rs.getString("RSex"), rs.getString("RBloodG"), rs.getString("RMobileN"),  rs.getString("REmail"), rs.getString("RAddress"), rs.getString("RAlternativeMN"), rs.getDate("RequestDate"), rs.getString("RApproval"));
                requestList.add(req);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return requestList;
    }

    public ArrayList<Request> getRequestList(String mobile) {
        query = "{? = call getRequestFunc(?)}";
        ArrayList<Request> requestList = new ArrayList<Request>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, mobile);
            boolean hasResult = cstmt.execute();
            System.out.println("" + hasResult);
            rs = (ResultSet) cstmt.getObject(1);
            Request req;
            while (rs.next()) {
                req = new Request(rs.getInt("RequestId"), rs.getString("RName"), rs.getString("RSex"), rs.getString("RBloodG"), rs.getString("RMobileN"),  rs.getString("REmail"), rs.getString("RAddress"), rs.getString("RAlternativeMN"), rs.getDate("RequestDate"), rs.getString("RApproval"));
                requestList.add(req);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return requestList;
    }

    public ArrayList<Donor> getDonor(String mobile) {
        query = "{? = call getDonorFunc(?)}";
        ArrayList<Donor> donor = new ArrayList<Donor>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, mobile);
            /*
            cstmt = connection.prepareCall(query);
            cstmt.setString(1, mobile);
            cstmt.registerOutParameter(2, Types.INTEGER);
            cstmt.registerOutParameter(3, Types.VARCHAR);
            cstmt.registerOutParameter(4, Types.VARCHAR);
            cstmt.registerOutParameter(5, Types.VARCHAR);
            cstmt.registerOutParameter(6, Types.VARCHAR);
            cstmt.registerOutParameter(7, Types.VARCHAR);
            cstmt.registerOutParameter(8, Types.VARCHAR);
            cstmt.registerOutParameter(9, Types.DATE);
            cstmt.registerOutParameter(10, Types.VARCHAR);
             */
            boolean hasResult = cstmt.execute();
            System.out.println("" + hasResult);
            Donor don;

            rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                //don = new Donor(rs.getInt("dId"), rs.getString("dName"), rs.getString("dSex"), rs.getString("dBloodG"), rs.getString("dMobileN"), rs.getString("dEmai"), rs.getString("dAddress"), rs.getString("dAlternativeMN"), rs.getDate("dRegDate"));
                don = new Donor(rs.getInt("DONORID"), rs.getString("DNAME"), rs.getString("DSEX"), rs.getString("DBLOODG"), rs.getString("DMOBILEN"), rs.getString("DEMAIL"), rs.getString("DADDRESS"), rs.getString("DALTERNATIVEMN"), rs.getDate("REGISTRATIONDATE"));
                donor.add(don);
            }
            rs.close();
            cstmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donor;
    }

    public ArrayList<Donation> getDonationList() {
        query = "{? = call getDonationListFunc(?)}";
        ArrayList<Donation> bloodList = new ArrayList<Donation>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, "YES");
            boolean hasResult = cstmt.execute();
            System.out.println("" + hasResult);
            rs = (ResultSet) cstmt.getObject(1);
            Donation donation;
            while (rs.next()) {
                donation = new Donation(rs.getInt("DonationID"), rs.getInt("DonorID"), rs.getString("DName"), rs.getString("DSex"), rs.getString("DBloodG"), rs.getString("DMobileN"), rs.getString("DEmail"), rs.getString("DAddress"), rs.getString("DAlternativeMN"), rs.getDate("DonationDate"));
                bloodList.add(donation);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bloodList;
    }

    public ArrayList<Donation> getBloodList(String bloodG) {
        query = "{? = call getBloodListFunc(?)}";
        ArrayList<Donation> bloodList = new ArrayList<Donation>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, bloodG);
            //cstmt.registerOutParameter(3, OracleTypes.CURSOR);

            /*
            cstmt.registerOutParameter(2, Types.INTEGER);
            cstmt.registerOutParameter(3, Types.INTEGER);
            cstmt.registerOutParameter(4, Types.VARCHAR);
            cstmt.registerOutParameter(5, Types.VARCHAR);
            cstmt.registerOutParameter(6, Types.VARCHAR);
            cstmt.registerOutParameter(7, Types.VARCHAR);
            cstmt.registerOutParameter(8, Types.VARCHAR);
            cstmt.registerOutParameter(9, Types.VARCHAR);
            cstmt.registerOutParameter(10, Types.VARCHAR);
            cstmt.registerOutParameter(11, Types.DATE);
            cstmt.registerOutParameter(12, Types.VARCHAR);
             */
            boolean hasResult = cstmt.execute();
            System.out.println("" + hasResult);
            Donation donation;
            //System.out.println("Hello PL/SQL");
            rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {
                donation = new Donation(rs.getInt("DonationID"), rs.getInt("DonorID"), rs.getString("DName"), rs.getString("DSex"), rs.getString("DBloodG"), rs.getString("DMobileN"), rs.getString("DEmail"), rs.getString("DAddress"), rs.getString("DAlternativeMN"), rs.getDate("DonationDate"));
                bloodList.add(donation);
            }

            cstmt.close();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bloodList;
    }

    public ArrayList<Operator> getOperatorList() {
        query = "{? = call getOperatorListFunc(?)}";
        ArrayList<Operator> operatorList = new ArrayList<Operator>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.setString(2, "NO");
            boolean hasResult = cstmt.execute();
            System.out.println("" + hasResult);
            rs = (ResultSet) cstmt.getObject(1);
            Operator ope;
            while (rs.next()) {
                ope = new Operator(rs.getInt("OperatorID"), rs.getString("OEmail"), rs.getString("OPassword"), rs.getString("OName"), rs.getString("OSex"), rs.getString("OBloodG"), rs.getString("OMobileN"), rs.getString("OEmail"), rs.getString("OAddress"), rs.getString("OAlternativeMN"), rs.getDate("OperatorRegDate"), rs.getString("Approval"));
                operatorList.add(ope);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return operatorList;
    }
    
    public ArrayList<Sell> getSellData() {
        query = "{? = call getSellDataFunc}";
        ArrayList<Sell> sellData = new ArrayList<Sell>();
        DatabaseConnection dbc = new DatabaseConnection();
        Connection connection = dbc.dbConnection();
        try {
            cstmt = connection.prepareCall(query);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            
            boolean hasResult = cstmt.execute();
            System.out.println("" + hasResult);
            rs = (ResultSet) cstmt.getObject(1);
            Sell sell;
            while (rs.next()) {
                sell = new Sell(rs.getInt("BAssignID"), rs.getInt("RequestID"), rs.getInt("DonationID"), rs.getString("BloodG"), rs.getDate("AssignDate"));
                sellData.add(sell);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sellData;
    }

}
