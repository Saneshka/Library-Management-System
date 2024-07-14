/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dto;

/**
 *
 * @author hirus
 */
public class BookDTO {
    
    private Integer bid;
    private String bCode;
    private String title;
    private String author;
    private String publisher;
    private String publishDate;
    private String description;
    private Integer qty;
    private Integer cid;

    public BookDTO() {
    }

    public BookDTO(Integer bid, String bCode, String title, String author, String publisher, String publishDate, String description, Integer qty, Integer cid) {
        this.bid = bid;
        this.bCode = bCode;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.description = description;
        this.qty = qty;
        this.cid = cid;
    }

    public BookDTO(String bCode, String title, String author, String publisher, String publishDate, String description, Integer qty, Integer cid) {
        this.bCode = bCode;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.description = description;
        this.qty = qty;
        this.cid = cid;
    }

    /**
     * @return the bid
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * @return the bCode
     */
    public String getbCode() {
        return bCode;
    }

    /**
     * @param bCode the bCode to set
     */
    public void setbCode(String bCode) {
        this.bCode = bCode;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the publishDate
     */
    public String getPublishDate() {
        return publishDate;
    }

    /**
     * @param publishDate the publishDate to set
     */
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return the cid
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "BookDTO{" + "bid=" + bid + ", bCode=" + bCode + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", publishDate=" + publishDate + ", description=" + description + ", qty=" + qty + ", cid=" + cid + '}';
    }
    
}
