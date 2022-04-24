package com.example.projetfinal.dao;

import com.example.projetfinal.bean.Commande;
import com.example.projetfinal.bean.LigneCommande;
import com.example.projetfinal.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LigneCommandeDao extends JpaRepository<LigneCommande, Long> {
    LigneCommande findByCommande(Commande commande);

    LigneCommande findByProduit(Produit produit);

    LigneCommande findByPrixLessThan(double prix);


    int deleteByProduit(Produit produit);
}
