package com.placement.placement_assignment.controllers;

import com.placement.placement_assignment.models.Subscriber;
import com.placement.placement_assignment.repositories.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SubscriberController {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @PostMapping("/subscribers")
    public Subscriber saveSubscriber(@RequestBody Subscriber subscriber) {
        
        return subscriberRepository.save(subscriber);
    }

    
    @GetMapping("/subscribers")
    public List<Subscriber> getAllSubscribers() {
        return subscriberRepository.findAll();
    }
}