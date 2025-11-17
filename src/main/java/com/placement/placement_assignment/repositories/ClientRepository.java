package com.placement.placement_assignment.repositories;

import com.placement.placement_assignment.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ClientRepository extends MongoRepository<Client, String> {
    
}