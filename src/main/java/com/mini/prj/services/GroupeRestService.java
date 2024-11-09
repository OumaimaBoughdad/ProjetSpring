package com.mini.prj.services;


import com.mini.prj.entities.Client;
import com.mini.prj.entities.Groupe;
import com.mini.prj.metier.ClientMetier;
import com.mini.prj.metier.GroupeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupeRestService {

    //crud create ,read ,update ,delete
    @Autowired
    private GroupeMetier groupeMetier;


    @RequestMapping(value="/groupes",method= RequestMethod.POST)
    public Groupe saveGroupe(@RequestBody Groupe c) {
        return groupeMetier.saveGroupe(c);
    }

    @RequestMapping(value="/groupes",method=RequestMethod.GET)
    public List<Groupe> listClient() {
        return groupeMetier.listGroupe();
    }


    @RequestMapping(value="/groupes/{id}",method=RequestMethod.DELETE)
    public void deleteClient(@PathVariable("id")Long id) {
        groupeMetier.deleteGroupe(id);
    }

    // New update method
    @RequestMapping(value = "/groupes/{id}", method = RequestMethod.PUT)
    public Groupe updateClient(@PathVariable("id") Long id, @RequestParam("nomGroupe") String nomGroupe) {
        return groupeMetier.updateGroupe(id, nomGroupe);
    }
}
