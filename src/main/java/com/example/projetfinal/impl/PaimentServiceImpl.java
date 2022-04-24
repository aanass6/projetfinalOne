/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.impl;

import com.example.projetfinal.bean.Commande;
import com.example.projetfinal.bean.Paiment;
import com.example.projetfinal.dao.PaimentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Acer
 */
@Service
public class PaimentServiceImpl {
    @Autowired
    private PaimentDao paimentDao;
    @Autowired
    private CommandeServiceImpl commandeServiceImpl;

    public int save(Paiment paiment) {
        if (findByTypePaiement(paiment.getTypePaiement()) != null) {
            return -1;
        }
        Commande commande = commandeServiceImpl.findByReference(paiment.getCommande().getRef());
        paiment.setCommande(commande);
        if (commande == null) {
            return -2;

        } else if (commande.getTotalPayEspece() + paiment.getMontant() > commande.getTotalPayEspece()) {
            return -3;

        } else {
            double nvTotalPayer = commande.getTotalPayEspece() + paiment.getMontant();

            commande.setTotalPayEspece(nvTotalPayer);
            commandeServiceImpl.save(commande);
            paimentDao.save(paiment);
            return 1;
        }


    }


    public Paiment findByTypePaiement(String typePaiement) {
        return paimentDao.findByTypePaiement(typePaiement);
    }

    public int deleteByTypePaiement(String typePaiement) {
        return paimentDao.deleteByTypePaiement(typePaiement);
    }
}
 