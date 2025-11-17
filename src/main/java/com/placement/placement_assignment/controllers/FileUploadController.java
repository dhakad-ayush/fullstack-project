package com.placement.placement_assignment.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;
import java.util.UUID; 

@RestController
@RequestMapping("/api")
public class FileUploadController {

    
    private final String UPLOAD_DIR = System.getProperty("user.dir") + "/src/main/resources/static/images/";

    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile file) {
        
       
        String originalFileName = StringUtils.cleanPath(file.getOriginalFilename());
        
        String fileExtension = "";
        try {
            fileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
        } catch (Exception e) {
            
        }
        String uniqueFileName = UUID.randomUUID().toString() + fileExtension;

        try {
            
            Path uploadPath = Paths.get(UPLOAD_DIR);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath); 
            }
            
            Path filePath = uploadPath.resolve(uniqueFileName);
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);

            
            String fileAccessPath = "/images/" + uniqueFileName;
            return ResponseEntity.ok(Map.of("filePath", fileAccessPath));

        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Could not save file");
        }
    }
}