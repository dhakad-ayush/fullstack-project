package com.placement.placement_assignment.models;

import java.time.LocalDateTime; 
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts") 
public class Contact {

    @Id
    private String id;
    
    private String fullName;
    private String email;
    private String mobileNumber;
    private String city;
    
    
    private LocalDateTime submittedAt;

    // --- Constructor ---
    
    public Contact() {
        this.submittedAt = LocalDateTime.now();
    }

    // --- Getters and Setters ---

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }
    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }
}