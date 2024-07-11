/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dto;

/**
 *
 * @author hirus
 */
public class MemberDTO {
    private Integer mid;
    private String mCode;
    private String firstName;
    private String lastName;
    private  String phoneNo;
    private String address;

    public MemberDTO() {
    }

    public MemberDTO(String mCode, String firstName, String lastName, String phoneNo, String address) {
        this.mCode = mCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public MemberDTO(Integer mid, String mCode, String firstName, String lastName, String phoneNo, String address) {
        this.mid = mid;
        this.mCode = mCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    /**
     * @return the mid
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * @param mid the mid to set
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * @return the mCode
     */
    public String getmCode() {
        return mCode;
    }

    /**
     * @param mCode the mCode to set
     */
    public void setmCode(String mCode) {
        this.mCode = mCode;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    
    
}
