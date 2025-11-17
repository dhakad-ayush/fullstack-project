package com.placement.placement_assignment.controllers;

import com.placement.placement_assignment.models.Contact;
import com.placement.placement_assignment.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    // 1. लैंडिंग पेज से नया कॉन्टैक्ट फॉर्म सबमिट करने के लिए
    // URL: POST http://localhost:8080/api/contacts
    @PostMapping("/contacts")
    public Contact saveContact(@RequestBody Contact contact) {
        // यह JSON को Contact ऑब्जेक्ट में बदलेगा और सेव करेगा
        // submittedAt टाइम अपने आप सेट हो जाएगा (Model के कंस्ट्रक्टर से)
        return contactRepository.save(contact);
    }

    // 2. एडमिन पैनल पर सारे कॉन्टैक्ट फॉर्म सबमिशन देखने के लिए
    // URL: GET http://localhost:8080/api/contacts
    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}