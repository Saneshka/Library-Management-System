/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.entity;

/**
 *
 * @author hirus
 */
public class CategoryEntity {
    
    private Integer cid;
    private String cCode;
    private String categoryName;
    private String description;

    public CategoryEntity() {
    }

    public CategoryEntity(Integer cid, String cCode, String categoryName, String description) {
        this.cid = cid;
        this.cCode = cCode;
        this.categoryName = categoryName;
        this.description = description;
    }

    public CategoryEntity(String cCode, String categoryName, String description) {
        this.cCode = cCode;
        this.categoryName = categoryName;
        this.description = description;
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

    /**
     * @return the cCode
     */
    public String getcCode() {
        return cCode;
    }

    /**
     * @param cCode the cCode to set
     */
    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    /**
     * @return the categoryName
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName the categoryName to set
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    @Override
    public String toString() {
        return "CategoryEntity{" + "cid=" + cid + ", cCode=" + cCode + ", categoryName=" + categoryName + ", description=" + description + '}';
    }
    
    
    
}
