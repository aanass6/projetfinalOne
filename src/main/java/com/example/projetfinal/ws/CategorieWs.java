package com.example.projetfinal.ws;


import com.example.projetfinal.bean.Categorie;
import com.example.projetfinal.impl.CategorieServiceImpl;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categorie")
public class CategorieWs {
    @Autowired
    private CategorieServiceImpl categorieService;

    @PostMapping("/")
    public int save(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }
    @GetMapping("/libelle/{libelle}")
    public List<Categorie> findByLibelle(@PathVariable String libelle) {
        return categorieService.findByLibelle(libelle);
    }
    @GetMapping("/")
    @NotNull
    public List<Categorie> findAll() {
        return categorieService.findAll();
    }

    @Transactional
    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return categorieService.deleteByLibelle(libelle);
    }
}
