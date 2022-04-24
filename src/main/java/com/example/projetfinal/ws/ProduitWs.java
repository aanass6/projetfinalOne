package com.example.projetfinal.ws;

import com.example.projetfinal.bean.Produit;
import com.example.projetfinal.impl.LigneCommandeServiceImpl;
import com.example.projetfinal.impl.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/produit")
public class ProduitWs {
    @Autowired
    private ProduitServiceImpl produitService;

    @PostMapping("/")
    public int save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }
    @PutMapping("/libelle/{libelle}")
    public int updateLibelle(@RequestBody Produit produit,@PathVariable String libelle) {
        return produitService.updateLibelle(produit, libelle);
    }
    @GetMapping("/reference/{reference}")
    public Produit findByReference(@PathVariable Long reference) {
        return produitService.findByReference(reference);
    }
    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable Long reference) {
        return produitService.deleteByReference(reference);
    }
}
