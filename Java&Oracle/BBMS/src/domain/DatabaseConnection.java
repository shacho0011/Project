/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Shadhin
 */
public class DatabaseConnection {

    private static Connection connection;
    private static String query;

    public Connection dbConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bbms", "123456");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e);
        }
        return connection;
    }
    
    public void insertData(){
        query = "CREATE OR REPLACE PROCEDURE insertDBUSER(\n" +
"	   p_userid IN DBUSER.USER_ID%TYPE,\n" +
"	   p_username IN DBUSER.USERNAME%TYPE,\n" +
"	   p_createdby IN DBUSER.CREATED_BY%TYPE,\n" +
"	   p_date IN DBUSER.CREATED_DATE%TYPE)\n" +
"IS\n" +
"BEGIN\n" +
"\n" +
"  INSERT INTO DBUSER (\"USER_ID\", \"USERNAME\", \"CREATED_BY\", \"CREATED_DATE\")\n" +
"  VALUES (p_userid, p_username,p_createdby, p_date);\n" +
"\n" +
"  COMMIT;\n" +
"\n" +
"END;\n" +
"/";
    }
}
