/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aakash.demo.Entity;

import java.util.Date;

/**
 *
 * @author aakashm
 */
public class User {
    
    private int userId;
    private String firstName, lastName, eMail, username, password;
    private boolean status;
    private Date joinDate;

    public User() {
    }

    public User(int userId, String firstName, String lastName, String eMail, String username, String password, boolean status, Date joinDate) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.username = username;
        this.password = password;
        this.status = status;
        this.joinDate = joinDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    
    
    
}
