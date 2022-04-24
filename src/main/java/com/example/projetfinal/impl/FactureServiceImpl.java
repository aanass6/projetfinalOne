/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.impl;

import java.util.List;

import com.example.projetfinal.bean.Facture;
import com.example.projetfinal.dao.FactureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Acer
 */
@Service
public class FactureServiceImpl {
    @Autowired
    private FactureDao factureDao;


    public int save(Facture facture) {
        if (findByRef(facture.getRef()) != null) {
            return -1;
        } else {
            factureDao.save(facture);
            return 1;
        }
    }

    public Facture findByRef(String ref) {
        return factureDao.findByRef(ref);
    }

@Transactional
    public int deleteByRef(String ref) {
        return factureDao.deleteByRef(ref);
    }
}
