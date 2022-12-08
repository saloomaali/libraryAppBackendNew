package com.NeST.libraryAppBackend1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Register")
public class Register {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String adharCardNo;
    private String address;
    private String pinCode;
    private String dob;
    private String emailId;
    private String phnNo;
    private String username;
    private String password;
    private String confirmPassword;

    public Register() {
    }

    public Register(int id, String name, String adharCardNo, String address, String pinCode, String dob, String emailId, String phnNo, String username, String password, String confirmPassword) {
        this.id = id;
        this.name = name;
        this.adharCardNo = adharCardNo;
        this.address = address;
        this.pinCode = pinCode;
        this.dob = dob;
        this.emailId = emailId;
        this.phnNo = phnNo;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdharCardNo() {
        return adharCardNo;
    }

    public void setAdharCardNo(String adharCardNo) {
        this.adharCardNo = adharCardNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
