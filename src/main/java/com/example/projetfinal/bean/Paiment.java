/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.bean;

import javax.persistence.*;

/**
 * @author Acer
 */
@Entity
public class Paiment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String typePaiement;
    private double montant;
    @ManyToOne
    private Commande commande;

    public Paiment() {
    }

    public Paiment(Long id, String typePaiement, double montant, Commande commande) {
        this.id = id;
        this.typePaiement = typePaiement;
        this.montant = montant;
        this.commande = commande;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(String typePaiement) {
        this.typePaiement = typePaiement;
    }

    public double isMontant() {
        return montant;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "Paiment{" +
                "id=" + id +
                ", typePaiement='" + typePaiement + '\'' +
                ", montant=" + montant +
                ", commande=" + commande +
                '}';
    }
}
