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
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Long id;
    private double totalPayEspece;
    @ManyToOne
    private Client client;
    private String etatCmd;
    private String ref;

    public Commande(Long id, double totalPayEspece, Client client, String etatCmd, String ref) {
        this.id = id;
        this.totalPayEspece = totalPayEspece;
        this.client = client;
        this.etatCmd = etatCmd;
        this.ref = ref;
    }

    public Commande() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotalPayEspece() {
        return totalPayEspece;
    }

    public void setTotalPayEspece(double totalPayEspece) {
        this.totalPayEspece = totalPayEspece;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getEtatCmd() {
        return etatCmd;
    }

    public void setEtatCmd(String etatCmd) {
        this.etatCmd = etatCmd;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", totalPayEspece=" + totalPayEspece +
                ", client=" + client +
                ", etatCmd='" + etatCmd + '\'' +
                ", ref='" + ref + '\'' +
                '}';
    }
}
