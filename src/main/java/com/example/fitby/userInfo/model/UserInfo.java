package com.example.fitby.userInfo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String firebaseUid;
    private String userEmail;
    private float weight;
    private int height;
    private String sex;

    public UserInfo(){
    }

    public UserInfo(Long userId, String firebaseUid, String userEmail, float weight, int height, String sex){
        this.userId = userId;
        this.firebaseUid = firebaseUid;
        this.userEmail = userEmail;
        this.weight = weight;
        this.sex = sex;
        this.height = height;
    }

    public UserInfo(String firebaseUid, String userEmail, float weight,int height, String sex){
        this.firebaseUid = firebaseUid;
        this.userEmail = userEmail;
        this.weight = weight;
        this.sex = sex;
        this.height = height;
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

    public int getHeightFeet() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
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
                ", height='" + height + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
