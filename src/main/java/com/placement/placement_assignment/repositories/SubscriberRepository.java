package com.placement.placement_assignment.repositories;

import com.placement.placement_assignment.models.Subscriber;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubscriberRepository extends MongoRepository<Subscriber, String> {
  
}