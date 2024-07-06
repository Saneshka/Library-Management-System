/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dto;

/**
 *
 * @author hirus
 */
public class UserDTO {
    
    private int uid;
    private String uCode;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    public UserDTO() {
    }

    public UserDTO(int uid, String uCode, String firstName, String lastName, String username, String password) {
        this.uid = uid;
        this.uCode = uCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }

    public UserDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
    

    /**
     * @return the uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * @return the uCode
     */
    public String getuCode() {
        return uCode;
    }

    /**
     * @param uCode the uCode to set
     */
    public void setuCode(String uCode) {
        this.uCode = uCode;
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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
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

    @Override
    public String toString() {
        return "UserDTO{" + "uid=" + uid + ", uCode=" + uCode + ", firstName=" + firstName + ", lastName=" + lastName + ", username=" + username + ", password=" + password + '}';
    }
    
}
