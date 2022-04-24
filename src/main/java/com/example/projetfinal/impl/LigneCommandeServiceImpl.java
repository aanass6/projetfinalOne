package com.example.projetfinal.impl;

import com.example.projetfinal.bean.Commande;
import com.example.projetfinal.bean.LigneCommande;
import com.example.projetfinal.bean.Produit;
import com.example.projetfinal.dao.LigneCommandeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LigneCommandeServiceImpl {
    @Autowired
    private LigneCommandeDao ligneCommandeDao;

    public int save(LigneCommande ligneCommande){
        if(findByCommande(ligneCommande.getCommande())!=null){
            return -1;
        }
        if(findByProduit(ligneCommande.getProduit())!=null){
            return -2;
        }
        if(ligneCommande.getPrix()<10.0){
            return -3;
        }
        if(ligneCommande.getQuantiteReception()>ligneCommande.getQuantite()){
            return -4;
        }
        else{
            ligneCommandeDao.save(ligneCommande);
            return 1;
        }
    }

    public int updateQuantiteReception(LigneCommande ligneCommande,double quantite){
        if (quantite < 1){
            return -1;
        }
        else{
            ligneCommande.setQuantite(quantite);
            return 1;
        }
    }

    public LigneCommande findByProduit(Produit produit) {
        return ligneCommandeDao.findByProduit(produit);
    }

    public LigneCommande findByCommande(Commande commande) {
        return ligneCommandeDao.findByCommande(commande);
    }

    public LigneCommande findByPrixLessThan(double prix) {
        return ligneCommandeDao.findByPrixLessThan(prix);
    }
    @Transactional
    public int deleteByProduit(Produit produit) {
        return ligneCommandeDao.deleteByProduit(produit);
    }
}
