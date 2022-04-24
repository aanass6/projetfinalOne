/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.bean;

import javax.persistence.*;

/**
 *
 * @author Acer
 */
@Entity
public class Facture {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String libelle;
    private String  ref;
    private double total;
    @ManyToOne
    private Commande commande;

    public Facture() {
    }

    public Facture(Long id, String libelle, String ref, double total, Commande commande) {
        this.id = id;
        this.libelle = libelle;
        this.ref = ref;
        this.total = total;
        this.commande = commande;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", ref='" + ref + '\'' +
                ", total=" + total +
                ", commande=" + commande +
                '}';
    }
}
