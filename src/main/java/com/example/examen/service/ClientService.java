package com.example.examen.service;

import com.example.examen.model.Client;
import com.example.examen.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    //add client
    public Client addClient(Client client) {
        clientRepository.save(client);
        return client;
    }

    //delete client
    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

    //update client
    public Client updateClient(Client client) {
        clientRepository.save(client);
        return client;
    }

    //get client
    public Client getClient(String name) {
        return clientRepository.findByName(name);
    }

}
