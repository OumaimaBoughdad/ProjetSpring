package com.mini.prj.metier;

import com.mini.prj.dao.CompteRepository;
import com.mini.prj.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompteMetierImpl implements CompteMetier {


    @Autowired
    private CompteRepository compteRepository;


    @Override
    public Compte saveClient(Compte c) {
        // TODO Auto-generated method stub
        return compteRepository.save(c);
    }
}
