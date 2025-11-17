package com.placement.placement_assignment.controllers;

import com.placement.placement_assignment.models.Client;
import com.placement.placement_assignment.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // यह बताता है कि यह एक API कंट्रोलर है
@RequestMapping("/api") // सभी URLs /api/ से शुरू होंगे
public class ClientController {

    @Autowired // Spring Boot को ClientRepository खुद से लाने के लिए कहता है
    private ClientRepository clientRepository;

    // 1. नया क्लाइंट जोड़ने के लिए (एडमिन पैनल से)
    // URL: POST http://localhost:8080/api/clients
    @PostMapping("/clients")
    public Client addClient(@RequestBody Client client) {
        // यह JSON डेटा को Client ऑब्जेक्ट में बदलेगा और सेव करेगा
        return clientRepository.save(client);
    }

    // 2. सारे क्लाइंट्स पाने के लिए (लैंडिंग पेज पर)
    // URL: GET http://localhost:8080/api/clients
    @GetMapping("/clients")
    public List<Client> getAllClients() {
        // यह डेटाबेस से सारे क्लाइंट्स ढूँढ कर वापस भेज देगा
        return clientRepository.findAll();
    }
}