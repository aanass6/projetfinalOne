package com.example.projetfinal.ws;

import com.example.projetfinal.bean.Commande;
import com.example.projetfinal.bean.LigneCommande;
import com.example.projetfinal.bean.Produit;
import com.example.projetfinal.impl.LigneCommandeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ligneCommande")
public class LigneCommandeWs {
    @Autowired
    private LigneCommandeServiceImpl ligneCommandeService;

    @PostMapping("/")
    public int save(@RequestBody LigneCommande ligneCommande) {
        return ligneCommandeService.save(ligneCommande);
    }
    @PutMapping("/quantite/{quantite}")
    public int updateQuantiteReception(@RequestBody LigneCommande ligneCommande, double quantite) {
        return ligneCommandeService.updateQuantiteReception(ligneCommande, quantite);
    }
    @GetMapping("/produit")
    public LigneCommande findByProduit(@RequestBody Produit produit) {
        return ligneCommandeService.findByProduit(produit);
    }
    @GetMapping("/commande")
    public LigneCommande findByCommande(@RequestBody Commande commande) {
        return ligneCommandeService.findByCommande(commande);
    }
    @GetMapping("/prix/{prix}")
    public LigneCommande findByPrixLessThan(@PathVariable double prix) {
        return ligneCommandeService.findByPrixLessThan(prix);
    }

    @Transactional
    @DeleteMapping("/")
    public int deleteByProduit(@RequestBody Produit produit) {
        return ligneCommandeService.deleteByProduit(produit);
    }
}
