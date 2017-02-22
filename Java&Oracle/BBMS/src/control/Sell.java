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
public class Sell {

    private int bAssignId;
    private int requestId;
    private int donationId;
    private String bloodG;
    private Date assignDate;

    public Sell(int bAssignId, int requestId, int donationId, String bloodG, Date assignDate) {
        this.bAssignId = bAssignId;
        this.requestId = requestId;
        this.donationId = donationId;
        this.bloodG = bloodG;
        this.assignDate = assignDate;
    }

    /**
     * @return the bAssignId
     */
    public int getbAssignId() {
        return bAssignId;
    }

    /**
     * @param bAssignId the bAssignId to set
     */
    public void setbAssignId(int bAssignId) {
        this.bAssignId = bAssignId;
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
     * @return the bloodG
     */
    public String getBloodG() {
        return bloodG;
    }

    /**
     * @param bloodG the bloodG to set
     */
    public void setBloodG(String bloodG) {
        this.bloodG = bloodG;
    }

    /**
     * @return the assignDate
     */
    public Date getAssignDate() {
        return assignDate;
    }

    /**
     * @param assignDate the assignDate to set
     */
    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

}
