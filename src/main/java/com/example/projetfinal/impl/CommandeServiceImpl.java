/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.impl;

import com.example.projetfinal.bean.Commande;
import com.example.projetfinal.dao.CommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Acer
 */
@Service
public class CommandeServiceImpl {
    @Autowired
    private CommandeDao commandeDao;

    public int save(Commande commande) {
        if (findByReference(commande.getRef()) != null) {
            return -1;
        } else {
            commandeDao.save(commande);
            return 1;
        }
    }

    public int payer(String ref, Float montant) {
        Commande commande = findByReference(ref);
        if (commande == null || commande.getId() == null)
            return -1;
        else {
            double nvTotalPaye = commande.getTotalPayEspece() + montant;
            commande.setTotalPayEspece(nvTotalPaye);
            commandeDao.save(commande);
            return 1;
        }

    }


    public Commande findByReference(String reference) {
        return commandeDao.findByRef(reference);
    }

    public Commande findByTotalPayEspece(double total) {
        return commandeDao.findByTotalPayEspece(total);
    }

    @Transactional
    public int deleteByReference(String reference) {
        return commandeDao.deleteByRef(reference);
    }
}
