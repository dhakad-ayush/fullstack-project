package com.placement.placement_assignment.models;

import java.time.LocalDateTime; 
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "subscribers")
public class Subscriber {

    @Id
    private String id;
    
    private String email;
    
    
    private LocalDateTime subscribedAt;

    // --- Constructor ---
    public Subscriber() {
        this.subscribedAt = LocalDateTime.now();
    }

    // --- Getters and Setters ---
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getSubscribedAt() {
        return subscribedAt;
    }
    public void setSubscribedAt(LocalDateTime subscribedAt) {
        this.subscribedAt = subscribedAt;
    }
}