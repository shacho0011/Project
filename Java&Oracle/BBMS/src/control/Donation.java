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
public class Donation {

    private int donationId;
    private int donorId;
    private String dName;
    private String dSex;
    private String dBloodG;
    private String dMobileN;
    private String dEmail;
    private String dAddress;
    private String dAlternativeMN;
    private Date DonationDate;

    public Donation(int donationId, int donorId, String dName, String dSex, String dBloodG, String dMobileN, String dEmail, String dAddress, String dAlternativeMN, Date DonationDate) {
        this.donationId = donationId;
        this.donorId = donorId;
        this.dName = dName;
        this.dSex = dSex;
        this.dBloodG = dBloodG;
        this.dMobileN = dMobileN;
        this.dEmail = dEmail;
        this.dAddress = dAddress;
        this.dAlternativeMN = dAlternativeMN;
        this.DonationDate = DonationDate;
    }
    
    public Donation(int donationId, int donorId) {
        this.donationId = donationId;
        this.donorId = donorId;
    }
    
    public Donation(Date DonationDate, String dBloodG) {
        this.DonationDate = DonationDate;
        this.dBloodG = dBloodG;
    }

    /**
     * @return the donationId
     */
    public int getDonationId() {
        return donationId;
    }

    /**
     * @param donationId the donationId to set
     */
    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }

    /**
     * @return the donorId
     */
    public int getDonorId() {
        return donorId;
    }

    /**
     * @param donorId the donorId to set
     */
    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    /**
     * @return the dName
     */
    public String getdName() {
        return dName;
    }

    /**
     * @param dName the dName to set
     */
    public void setdName(String dName) {
        this.dName = dName;
    }

    /**
     * @return the dSex
     */
    public String getdSex() {
        return dSex;
    }

    /**
     * @param dSex the dSex to set
     */
    public void setdSex(String dSex) {
        this.dSex = dSex;
    }

    /**
     * @return the dBloodG
     */
    public String getdBloodG() {
        return dBloodG;
    }

    /**
     * @param dBloodG the dBloodG to set
     */
    public void setdBloodG(String dBloodG) {
        this.dBloodG = dBloodG;
    }

    /**
     * @return the dMobileN
     */
    public String getdMobileN() {
        return dMobileN;
    }

    /**
     * @param dMobileN the dMobileN to set
     */
    public void setdMobileN(String dMobileN) {
        this.dMobileN = dMobileN;
    }

    /**
     * @return the dEmail
     */
    public String getdEmail() {
        return dEmail;
    }

    /**
     * @param dEmail the dEmail to set
     */
    public void setdEmail(String dEmail) {
        this.dEmail = dEmail;
    }

    /**
     * @return the dAddress
     */
    public String getdAddress() {
        return dAddress;
    }

    /**
     * @param dAddress the dAddress to set
     */
    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }

    /**
     * @return the dAlternativeMN
     */
    public String getdAlternativeMN() {
        return dAlternativeMN;
    }

    /**
     * @param dAlternativeMN the dAlternativeMN to set
     */
    public void setdAlternativeMN(String dAlternativeMN) {
        this.dAlternativeMN = dAlternativeMN;
    }

    /**
     * @return the DonationDate
     */
    public Date getDonationDate() {
        return DonationDate;
    }

    /**
     * @param DonationDate the DonationDate to set
     */
    public void setDonationDate(Date DonationDate) {
        this.DonationDate = DonationDate;
    }
    
    

}
