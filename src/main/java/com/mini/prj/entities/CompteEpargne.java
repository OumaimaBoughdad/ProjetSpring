package com.mini.prj.entities;

import jakarta.persistence.Entity;

import java.util.Date;


@Entity
public class CompteEpargne extends Compte{
    private double taux;
    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }
    public CompteEpargne(String codeCompte, Date dateCreation, double solde,
                         double taux) {
        super(codeCompte, dateCreation, solde);
        this.taux = taux;
    }
    public CompteEpargne() {
        super();
// TODO Auto-generated constructor stub
    }
}
