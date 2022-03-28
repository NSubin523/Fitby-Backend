package com.example.fitby.food.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.tomcat.util.buf.StringCache;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table
public class FoodModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String firebaseUid;
    private String name;
    private double calories;
    private double carbs;
    private double protein;
    private double fat;

    public FoodModel(){
    }

    public FoodModel(String id, String firebaseUid, String name, double calories, double carbs, double protein, double fat){
        this.id = id;
        this.firebaseUid = firebaseUid;
        this.name = name;
        this.calories = calories;
        this.carbs = carbs;
        this.protein = protein;
        this.fat = fat;
    }

    public FoodModel(String firebaseUid, String name, double calories, double carbs, double protein, double fat){
        this.firebaseUid = firebaseUid;
        this.name = name;
        this.calories = calories;
        this.carbs = carbs;
        this.protein = protein;
        this.fat = fat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirebaseUid() {
        return firebaseUid;
    }

    public void setFirebaseUid(String firebaseUid) {
        this.firebaseUid = firebaseUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "FoodModel{" +
                "id=" + id +
                ", firebaseUid='" + firebaseUid + '\'' +
                ", name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                ", carbs='" + carbs + '\'' +
                ", protein='" + protein + '\'' +
                ", fat='" + fat + '\'' +
                '}';
    }
}
