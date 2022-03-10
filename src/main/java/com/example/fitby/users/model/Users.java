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

    private String firebaseUid;
    private String fullName;
    private String userEmail;
    private String password;

    public Users(){

    }

    public Users(Long userId, String fullName, String firebaseUid, String userEmail, String password) {
        this.fullName = fullName;
        this.firebaseUid = firebaseUid;
        this.userId = userId;
        this.userEmail = userEmail;
        this.password = password;
    }

    public Users(String fullName, String firebaseUid, String userEmail, String password) {
        this.fullName = fullName;
        this.firebaseUid = firebaseUid;
        this.userEmail = userEmail;
        this.password = password;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getUserId() {
        return userId;
    }

    public String getFirebaseUid() {
        return firebaseUid;
    }

    public void setFirebaseUid(String awsID) {
        this.firebaseUid = awsID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
                ", firebaseUid='" + firebaseUid + '\'' +
                ", fullName='" + fullName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
