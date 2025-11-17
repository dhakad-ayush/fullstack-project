package com.placement.placement_assignment.repositories;

import com.placement.placement_assignment.models.Project;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProjectRepository extends MongoRepository<Project, String> {
    
}