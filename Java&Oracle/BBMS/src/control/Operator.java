/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.sql.Date;

/**
 *
 * @author Shadhin
 */
public class Operator {

    private int operatorId;
    private String userName;
    private String password;
    private String oName;

    private String oSex;
    private String oBloodG;
    private String oMobileN;
    private String oEmail;
    private String oAddress;
    private String oAlternativeMN;
    private Date operatorReqDate;
    private String oApproval;

    public Operator(int operatorId, String userName, String password, String oName, String oSex, String oBloodG, String oMobileN, String oEmail, String oAddress, String oAlternativeMN, Date operatorReqDate, String oApproval) {
        this.operatorId = operatorId;
        this.userName = userName;
        this.password = password;
        this.oName = oName;
        this.oSex = oSex;
        this.oBloodG = oBloodG;
        this.oMobileN = oMobileN;
        this.oEmail = oEmail;
        this.oAddress = oAddress;
        this.oAlternativeMN = oAlternativeMN;
        this.operatorReqDate = operatorReqDate;
        this.oApproval = oApproval;
    }

    public Operator(String password) {
        this.password = password;
    }
    
    

    /**
     * @return the operatorId
     */
    public int getOperatorId() {
        return operatorId;
    }

    /**
     * @param operatorId the operatorId to set
     */
    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the oName
     */
    public String getoName() {
        return oName;
    }

    /**
     * @param oName the oName to set
     */
    public void setoName(String oName) {
        this.oName = oName;
    }

    /**
     * @return the oSex
     */
    public String getoSex() {
        return oSex;
    }

    /**
     * @param oSex the oSex to set
     */
    public void setoSex(String oSex) {
        this.oSex = oSex;
    }

    /**
     * @return the oBloodG
     */
    public String getoBloodG() {
        return oBloodG;
    }

    /**
     * @param oBloodG the oBloodG to set
     */
    public void setoBloodG(String oBloodG) {
        this.oBloodG = oBloodG;
    }

    /**
     * @return the oMobileN
     */
    public String getoMobileN() {
        return oMobileN;
    }

    /**
     * @param oMobileN the oMobileN to set
     */
    public void setoMobileN(String oMobileN) {
        this.oMobileN = oMobileN;
    }

    /**
     * @return the oEmail
     */
    public String getoEmail() {
        return oEmail;
    }

    /**
     * @param oEmail the oEmail to set
     */
    public void setoEmail(String oEmail) {
        this.oEmail = oEmail;
    }

    /**
     * @return the oAddress
     */
    public String getoAddress() {
        return oAddress;
    }

    /**
     * @param oAddress the oAddress to set
     */
    public void setoAddress(String oAddress) {
        this.oAddress = oAddress;
    }

    /**
     * @return the oAlternativeMN
     */
    public String getoAlternativeMN() {
        return oAlternativeMN;
    }

    /**
     * @param oAlternativeMN the oAlternativeMN to set
     */
    public void setoAlternativeMN(String oAlternativeMN) {
        this.oAlternativeMN = oAlternativeMN;
    }

    /**
     * @return the operatorReqDate
     */
    public Date getOperatorReqDate() {
        return operatorReqDate;
    }

    /**
     * @param operatorReqDate the operatorReqDate to set
     */
    public void setOperatorReqDate(Date operatorReqDate) {
        this.operatorReqDate = operatorReqDate;
    }

    /**
     * @return the oApproval
     */
    public String getoApproval() {
        return oApproval;
    }

    /**
     * @param oApproval the oApproval to set
     */
    public void setoApproval(String oApproval) {
        this.oApproval = oApproval;
    }

}
