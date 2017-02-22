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
public class Request {

    private int requestId;
    private String rName;
    private String rSex;
    private String rBloodG;
    private String rMobileN;
    private String rEmail;
    private String rAddress;
    private String rAlternativeMN;
    private Date requestDate;
    private String rApproval;

    public Request(int requestId, String rName, String rSex, String rBloodG, String rMobileN, String rEmail, String rAddress, String rAlternativeMN, Date requestDate, String rApproval) {
        this.requestId = requestId;
        this.rName = rName;
        this.rSex = rSex;
        this.rBloodG = rBloodG;
        this.rMobileN = rMobileN;
        this.rEmail = rEmail;
        this.rAddress = rAddress;
        this.rAlternativeMN = rAlternativeMN;
        this.requestDate = requestDate;
        this.rApproval = rApproval;
    }

    /**
     * @return the requestId
     */
    public int getRequestId() {
        return requestId;
    }

    /**
     * @param requestId the requestId to set
     */
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    /**
     * @return the rName
     */
    public String getrName() {
        return rName;
    }

    /**
     * @param rName the rName to set
     */
    public void setrName(String rName) {
        this.rName = rName;
    }

    /**
     * @return the rSex
     */
    public String getrSex() {
        return rSex;
    }

    /**
     * @param rSex the rSex to set
     */
    public void setrSex(String rSex) {
        this.rSex = rSex;
    }

    /**
     * @return the rBloodG
     */
    public String getrBloodG() {
        return rBloodG;
    }

    /**
     * @param rBloodG the rBloodG to set
     */
    public void setrBloodG(String rBloodG) {
        this.rBloodG = rBloodG;
    }

    /**
     * @return the rMobileN
     */
    public String getrMobileN() {
        return rMobileN;
    }

    /**
     * @param rMobileN the rMobileN to set
     */
    public void setrMobileN(String rMobileN) {
        this.rMobileN = rMobileN;
    }

    /**
     * @return the rEmail
     */
    public String getrEmail() {
        return rEmail;
    }

    /**
     * @param rEmail the rEmail to set
     */
    public void setrEmail(String rEmail) {
        this.rEmail = rEmail;
    }

    /**
     * @return the rAddress
     */
    public String getrAddress() {
        return rAddress;
    }

    /**
     * @param rAddress the rAddress to set
     */
    public void setrAddress(String rAddress) {
        this.rAddress = rAddress;
    }

    /**
     * @return the rAlternativeMN
     */
    public String getrAlternativeMN() {
        return rAlternativeMN;
    }

    /**
     * @param rAlternativeMN the rAlternativeMN to set
     */
    public void setrAlternativeMN(String rAlternativeMN) {
        this.rAlternativeMN = rAlternativeMN;
    }

    /**
     * @return the requestDate
     */
    public Date getRequestDate() {
        return requestDate;
    }

    /**
     * @param requestDate the requestDate to set
     */
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    /**
     * @return the rApproval
     */
    public String getrApproval() {
        return rApproval;
    }

    /**
     * @param rApproval the rApproval to set
     */
    public void setrApproval(String rApproval) {
        this.rApproval = rApproval;
    }

}
