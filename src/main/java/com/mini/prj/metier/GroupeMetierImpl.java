package com.mini.prj.metier;

import com.mini.prj.dao.ClientRepository;
import com.mini.prj.dao.GroupeRepository;
import com.mini.prj.entities.Client;
import com.mini.prj.entities.Groupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GroupeMetierImpl implements  GroupeMetier{

    @Autowired
    private GroupeRepository groupeRepository;


    @Override
    public Groupe saveGroupe(Groupe c) {
        // TODO Auto-generated method stub
        return groupeRepository.save(c);
    }

    @Override
    public List<Groupe> listGroupe() {
        // TODO Auto-generated method stub
        return groupeRepository.findAll();
    }

    @Override
    public void deleteGroupe(Long id) {
        groupeRepository.deleteById(id);
    }

    @Override
    public Groupe updateGroupe(Long id, String nomGroupe) {
        Optional<Groupe> existingClient = groupeRepository.findById(id);
        if(existingClient.isPresent()) {
            Groupe groupe= existingClient.get();
            groupe.setNomGroupe(nomGroupe);
            return groupeRepository.save(groupe);
        }else{
            throw new RuntimeException("Client with ID " + id + " not found");
        }
    }
}
