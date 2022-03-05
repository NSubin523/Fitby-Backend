package com.example.fitby.users.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String awsID;
    private String fullName;
    private String userName;
    private String userEmail;
    private String password;

    public Users(){

    }

    public Users(Long userId, String fullName, String awsID, String userName, String userEmail, String password) {
        this.fullName = fullName;
        this.awsID = awsID;
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.password = password;
    }

    public Users(String fullName, String awsID, String userName, String userEmail, String password) {
        this.fullName = fullName;
        this.awsID = awsID;
        this.userName = userName;
        this.userEmail = userEmail;
        this.password = password;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getUserId() {
        return userId;
    }

    public String getAwsID() {
        return awsID;
    }

    public void setAwsID(String awsID) {
        this.awsID = awsID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
