/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.impl;

import com.example.projetfinal.bean.LigneCommande;
import com.example.projetfinal.bean.Produit;
import com.example.projetfinal.dao.ProduitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class ProduitServiceImpl {
    @Autowired
    private ProduitDao produitDao;

    public int save(Produit produit){
        if(findByReference(produit.getReference())!=null){
            return -1;
        }
        if(findByReference(produit.getReference())!=null){
            return -2;
        }
        else{
            produitDao.save(produit);
            return 1;
        }
    }
    public int updateLibelle(Produit produit,String libelle){
        if(findByReference(produit.getReference())!=null) {
            return -1;
        }
            else{
                produit.setLibelle(libelle);
                produitDao.save(produit);
            return 1;
        }
    }



    public Produit findByReference(Long reference) {
        return produitDao.findByReference(reference);
    }

    public int deleteByReference(Long reference) {
        return produitDao.deleteByReference(reference);
    }
}
