package com.placement.placement_assignment.repositories;

import com.placement.placement_assignment.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ContactRepository extends MongoRepository<Contact, String> {
    }