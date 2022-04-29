package com.example.examen.controller;

import com.example.examen.model.Client;
import com.example.examen.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("client")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }
    @PostMapping
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @PostMapping("/deleteClient")
    public void deleteClient(@RequestBody Client client) {
        clientService.deleteClient(client);
    }

    @PostMapping("/getClient")
    public Client getClient(@RequestBody Client client) {
        return clientService.getClient(String.valueOf(client));
    }
}
