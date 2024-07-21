/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.entity;

/**
 *
 * @author hirus
 */
public class FineEntity {
    private Integer fineId;
    private  Integer lendId;
    private  Double amount;
    private Boolean isPaid;

    public FineEntity() {
    }

    public FineEntity(Integer fineId, Integer lendId, Double amount, Boolean isPaid) {
        this.fineId = fineId;
        this.lendId = lendId;
        this.amount = amount;
        this.isPaid = isPaid;
    }

    public FineEntity(Integer lendId, Double amount, Boolean isPaid) {
        this.lendId = lendId;
        this.amount = amount;
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
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
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
        return "FineEntity{" + "fineId=" + fineId + ", lendId=" + lendId + ", amount=" + amount + ", isPaid=" + isPaid + '}';
    }
    
    
}
