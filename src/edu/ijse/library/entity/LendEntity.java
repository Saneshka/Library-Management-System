/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.entity;

/**
 *
 * @author hirus
 */
public class LendEntity {
    private Integer lid;
    private String lCode;
    private Integer bookId;
    private  Integer memberId;
    private String borrowDate;
    private String dueDate;
    private String returnDate;
    private Double fine;

    public LendEntity() {
    }

    public LendEntity(Integer lid, String lCode, Integer bookId, Integer memberId, String brrowDate, String dueDate, String returnDate, Double fine) {
        this.lid = lid;
        this.lCode = lCode;
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = brrowDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    public LendEntity(String lCode, Integer bookId, Integer memberId, String brrowDate, String dueDate) {
        this.lCode = lCode;
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = brrowDate;
        this.dueDate = dueDate;
    }

    public LendEntity(String lCode, String returnDate, Double fine) {
        this.lCode = lCode;
        this.returnDate = returnDate;
        this.fine = fine;
    }

    

    /**
     * @return the lid
     */
    public Integer getLid() {
        return lid;
    }

    /**
     * @param lid the lid to set
     */
    public void setLid(Integer lid) {
        this.lid = lid;
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
     * @return the bookId
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the memberId
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * @return the borrowDate
     */
    public String getBorrowDate() {
        return borrowDate;
    }

    /**
     * @param borrowDate the borrowDate to set
     */
    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    /**
     * @return the dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the returnDate
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * @param returnDate the returnDate to set
     */
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * @return the fine
     */
    public Double getFine() {
        return fine;
    }

    /**
     * @param fine the fine to set
     */
    public void setFine(Double fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "LendEntity{" + "lid=" + lid + ", lCode=" + lCode + ", bookId=" + bookId + ", memberId=" + memberId + ", borrowDate=" + borrowDate + ", dueDate=" + dueDate + ", returnDate=" + returnDate + ", fine=" + fine + '}';
    }
    
}
