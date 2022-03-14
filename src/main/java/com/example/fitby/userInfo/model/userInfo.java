package com.example.fitby.userInfo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table
public class userInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firebaseUid;
    private String userEmail;
    private float weight;
    private byte heightFeet;
    private byte heightInches;
    private String sex;

    public userInfo(){
    }

    public userInfo(Long userId, String firebaseUid, String userEmail, float weight, byte heightFeet, byte heightInches, String sex){
        this.userId = userId;
        this.firebaseUid = firebaseUid;
        this.userEmail = userEmail;
        this.weight = weight;
        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
        this.sex = sex;
    }

    public userInfo(String firebaseUid, String userEmail, float weight, byte heightFeet, byte heightInches, String sex){
        this.firebaseUid = firebaseUid;
        this.userEmail = userEmail;
        this.weight = weight;
        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
        this.sex = sex;
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

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }

    public byte getHeightFeet() {
        return heightFeet;
    }
    public void setHeightFeet(byte heightFeet) {
        this.heightFeet = heightFeet;
    }

    public byte getHeightInches() {
        return heightInches;
    }
    public void setHeightInches(byte heightInches) {
        this.heightInches = heightInches;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "userInfo{" +
                "userId=" + userId +
                ", firebaseUid='" + firebaseUid + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", weight='" + weight + '\'' +
                ", heightFeet='" + heightFeet + '\'' +
                ", heightInches='" + heightInches + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
