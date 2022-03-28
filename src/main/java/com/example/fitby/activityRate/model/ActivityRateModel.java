package com.example.fitby.activityRate.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table
public class ActivityRateModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String activityType;

    public ActivityRateModel(){
    }

    public ActivityRateModel(String id, String activityType) {
        this.id = id;
        this.activityType = activityType;
    }

    public ActivityRateModel(String activityType) {
        this.activityType = activityType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    @Override
    public String toString() {
        return "activityRateModel{" +
                "Id=" + id +
                ", activityType='" + activityType + '\'' +
                '}';
    }
}
