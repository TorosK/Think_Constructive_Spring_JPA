package com.example.think_constructive_spring_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StoreInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storeID;
    private String storeName;
    private String storeDetails;
    private String storePhoneNr;

    public StoreInformation() {
    }

    public StoreInformation(String storeName, String storeDetails, String storePhoneNr) {
        this.storeName = storeName;
        this.storeDetails = storeDetails;
        this.storePhoneNr = storePhoneNr;
    }

    public Integer getStoreID() {
        return storeID;
    }

    public void setStoreID(Integer storeID) {
        this.storeID = storeID;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDetails() {
        return storeDetails;
    }

    public void setStoreDetails(String storeDetails) {
        this.storeDetails = storeDetails;
    }

    public String getStorePhoneNr() {
        return storePhoneNr;
    }

    public void setStorePhoneNr(String storePhoneNr) {
        this.storePhoneNr = storePhoneNr;
    }

    @Override
    public String toString() {
        return "StoreInformation{" +
                "storeID=" + storeID +
                ", storeName='" + storeName + '\'' +
                ", storeDetails='" + storeDetails + '\'' +
                ", storePhoneNr='" + storePhoneNr + '\'' +
                '}';
    }
}
