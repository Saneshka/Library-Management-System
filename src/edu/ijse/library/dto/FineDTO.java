/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dto;

/**
 *
 * @author hirus
 */
public class FineDTO {
    private Integer fineId;
    private Integer lendId;
    private String lCode;
    private Double fineAmount;
    private Boolean isPaid;

    public FineDTO() {
    }

    public FineDTO(Integer fineId, Integer lendId, String lCode, Double fineAmount, Boolean isPaid) {
        this.fineId = fineId;
        this.lendId = lendId;
        this.lCode = lCode;
        this.fineAmount = fineAmount;
        this.isPaid = isPaid;
    }    
    

    /**
     * @return the fineId
     */
    public Integer getFineId() {
        return fineId;
    }

    /**
     * @param fineId the fineId to set
     */
    public void setFineId(Integer fineId) {
        this.fineId = fineId;
    }

    /**
     * @return the lendId
     */
    public Integer getLendId() {
        return lendId;
    }

    /**
     * @param lendId the lendId to set
     */
    public void setLendId(Integer lendId) {
        this.lendId = lendId;
    }

    /**
     * @return the lCode
     */
    public String getlCode() {
        return lCode;
    }

    /**
     * @param lCode the lCode to set
     */
    public void setlCode(String lCode) {
        this.lCode = lCode;
    }

    /**
     * @return the fineAmount
     */
    public Double getFineAmount() {
        return fineAmount;
    }

    /**
     * @param fineAmount the fineAmount to set
     */
    public void setFineAmount(Double fineAmount) {
        this.fineAmount = fineAmount;
    }

    /**
     * @return the isPaid
     */
    public Boolean getIsPaid() {
        return isPaid;
    }

    /**
     * @param isPaid the isPaid to set
     */
    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    @Override
    public String toString() {
        return "FineDTO{" + "fineId=" + fineId + ", lendId=" + lendId + ", lCode=" + lCode + ", fineAmount=" + fineAmount + ", isPaid=" + isPaid + '}';
    }
    
    
    
}
