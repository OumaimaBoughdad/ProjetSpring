package com.mini.prj.metier;

import com.mini.prj.dao.ClientRepository;
import com.mini.prj.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientMetierImpl implements ClientMetier{


    @Autowired
    private ClientRepository clientRepository;


    @Override
    public Client saveClient(Client c) {
        // TODO Auto-generated method stub
        return clientRepository.save(c);
    }

    @Override
    public List<Client> listClient() {
        // TODO Auto-generated method stub
        return clientRepository.findAll();
    }


    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client updateClient(Long id, String nomClient) {
        Optional<Client> existingClient = clientRepository.findById(id);
        if(existingClient.isPresent()) {
            Client client = existingClient.get();
            client.setNomClient(nomClient);
            return clientRepository.save(client);
        }else{
            throw new RuntimeException("Client with ID " + id + " not found");
        }
    }

}
