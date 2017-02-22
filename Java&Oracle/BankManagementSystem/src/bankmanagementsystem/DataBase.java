/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankmanagementsystem;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Shadhin
 */
public class DataBase extends JFrame{
    void Entry(String accountno, String name, String fathersname, String mothersname, String presentaddress, String permanentaddress, String sex, String birthdate, String age,String nationality,  String profession, String email, String phonenumber, String accounttype, String accountcurrency, String depositemode,  String checqbookrequest, String openingbalance, String openingdate, String expiredate, String atmcardrequest, String referenceaccountnumber){
        try{
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "J:/Java/BankManagementSystem/BankManagementSystem";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            stmt.execute("insert into Account(AccountNo, Name, FathersName, MothersName, PresentAddress, PermanentAddress, Sex, BirthDate, Age, Nationality, Profession, Email, PhoneNumber, AccountType, AccountCurrency, DepositeMode, ChecqBookRequest, OpeningBalance, OpeningDate, ExpireDate, ATMCardRequest, ReferenceAccountNumber)"+"values('"+accountno+"', '"+name+"', '"+fathersname+"', '"+mothersname+"', '"+presentaddress+"', '"+permanentaddress+"', '"+sex+"', '"+birthdate+"', '"+age+"', '"+nationality+"', '"+profession+"', '"+email+"', '"+phonenumber+"', '"+accounttype+"', '"+accountcurrency+"', '"+depositemode+"', '"+checqbookrequest+"', '"+openingbalance+"', '"+openingdate+"', '"+expiredate+"', '"+atmcardrequest+"','"+referenceaccountnumber+"')");
            //stmt.execute("Delete from student where name='student3' and s_age=23");
            //stmt.execute("update student set s_age=29 where s_age=28");
            //stmt.execute("Select * from student");            
            //ResultSet result= stmt.getResultSet();            
            //while(result.next()){
                //System.out.println("Name: "+result.getString("name")+" Age: "+ result.getString("s_age"));
            //}
            //stmt.execute("Select count(*) as counter from student");
            //ResultSet rs= stmt.getResultSet();
            //rs.next();
            //int count = rs.getInt("counter");
            //System.out.println(count);

	    stmt.close();            
            con.close();
        } 
	catch (Exception err) {
            System.out.println("ERROR: " + err);
        }
    }
    
    void Search(String accountno){
        ShowDetails details = new ShowDetails();
        try{
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "J:/Java/BankManagementSystem/BankManagementSystem";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
            //stmt.execute("insert into Account(AccountNo, Name, FathersName, MothersName, PresentAddress, PermanentAddress, Sex, BirthDate, Age, Nationality, Profession, Email, PhoneNumber, AccountType, AccountCurrency, DepositMode, ChecqBookRequest, OpeningBalance, OpeningDate, ExpireDate, ATMCardRequest, ReferenceAccountNumber)"+"values('"+accountno+"', '"+name+"', '"+fathersname+"', '"+mothersname+"', '"+presentaddress+"', '"+permanentaddress+"', '"+sex+"', '"+birthdate+"', '"+age+"', '"+nationality+"', '"+profession+"', '"+email+"', '"+phonenumber+"', '"+accounttype+"', '"+accountcurrency+"', '"+depositemode+"', '"+checqbookrequest+"', '"+openingbalance+"', '"+openingdate+"', '"+expiredate+"', '"+atmcardrequest+"','"+referenceaccountnumber+"')");
            //stmt.execute("Delete from student where name='student3' and s_age=23");
            //stmt.execute("update student set s_age=29 where s_age=28");
            stmt.execute("Select * from Account where AccountNo = '"+accountno+"'");            
            ResultSet result= stmt.getResultSet();            
            while(result.next()){
                //System.out.println("Shadhin");
                String name = result.getString("Name");
                //System.out.println(name);
                String fathersname = result.getString("FathersName");
                //System.out.println(fathersname);
                String mothersname = result.getString("MothersName");
                String presentaddress = result.getString("PresentAddress");
                String permanentaddress = result.getString("PermanentAddress");
                String sex = result.getString("Sex");
                String birthdate = result.getString("BirthDate");
                String age = result.getString("Age");
                //System.out.println(age);
                String nationality = result.getString("Nationality");
                String profession = result.getString("Profession");
                String email = result.getString("Email");
                //System.out.println(email);
                String phonenumber = result.getString("PhoneNumber");
                String accounttype = result.getString("AccountType");
                //System.out.println(accounttype);
                String accountcurrency = result.getString("AccountCurrency");
                //System.out.println(accountcurrency);
                String depositemode = result.getString("DepositeMode");
                //System.out.println(depositemode);
                String checqbookrequest = result.getString("ChecqBookRequest");
                String openingbalance = result.getString("OpeningBalance");
                String openingdate = result.getString("Openingdate");
                //System.out.println(openingdate);
                String expiredate = result.getString("ExpireDate");
                //System.out.println(expiredate);
                String atmcardrequest = result.getString("ATMCardRequest");
                //System.out.println(atmcardrequest);
                String referenceaccountnumber = result.getString("ReferenceAccountNumber");
                //System.out.println(referenceaccountnumber);
                //System.out.println("Name: "+result.getString("Name")+" Age: "+ result.getString("Age")+" Father: "+ result.getString("FathersName"));
                
                details.Details(accountno, name, fathersname, mothersname, presentaddress, permanentaddress, sex, birthdate, age, nationality, profession, email, phonenumber, accounttype, accountcurrency, depositemode, checqbookrequest, openingbalance, openingdate, expiredate, atmcardrequest, referenceaccountnumber);
                //details.Details(result.getString("AccountNo"),result.getString("Name"),result.getString("FathersName"),result.getString("MothersName"),result.getString("PresentAddress"),result.getString("PermanentAddress"),result.getString("Sex"),result.getString("BirthDate"),result.getString("Age"),result.getString("Nationality"),result.getString("Profession"),result.getString("Email"),result.getString("PhoneNumber"),result.getString("AccountType"),result.getString("AccountCurrency"),result.getString("DepositeMode"),result.getString("ChecqBookRequest"),result.getString("OpeningBalance"),result.getString("Openingdate"),result.getString("ExpireDate"),result.getString("ATMCardRequest"),result.getString("ReferenceAccountNo"));
            }
            //stmt.execute("Select count(*) as counter from student");
            //ResultSet rs= stmt.getResultSet();
            //rs.next();
            //int count = rs.getInt("counter");
            //System.out.println(count);

	    stmt.close();            
            con.close();
        } 
	catch (Exception err) {
            System.out.println("ERROR: " + err);
        }
    }
}
