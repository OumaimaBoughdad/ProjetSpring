package com.mini.prj.services;


import com.mini.prj.entities.Client;
import com.mini.prj.entities.Compte;
import com.mini.prj.metier.ClientMetier;
import com.mini.prj.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompteRestService {
    //crud create ,read ,update ,delete
    @Autowired
    private CompteMetier compteMetier;

    @RequestMapping(value="/comptes",method= RequestMethod.POST)
    public Compte saveClient(@RequestBody Compte c) {
        return compteMetier.saveClient(c);
    }


}
