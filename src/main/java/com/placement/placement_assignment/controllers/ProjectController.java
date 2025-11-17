package com.placement.placement_assignment.controllers;

import com.placement.placement_assignment.models.Project;
import com.placement.placement_assignment.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping("/api") 
public class ProjectController {

    @Autowired 
    private ProjectRepository projectRepository;

    
    @PostMapping("/projects")
    public Project addProject(@RequestBody Project project) {
        
        return projectRepository.save(project);
    }

    
    @GetMapping("/projects")
    public List<Project> getAllProjects() {
        
        return projectRepository.findAll();
    }
}