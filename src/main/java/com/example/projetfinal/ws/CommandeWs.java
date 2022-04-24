/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.ws;

import com.example.projetfinal.bean.Commande;
import com.example.projetfinal.impl.CommandeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author Acer
 */
@RestController
@RequestMapping("/api/v1/commande")
public class CommandeWs {
    @Autowired
    private CommandeServiceImpl commandeService;


    @PostMapping("/")
    public int save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @PutMapping("/ref/{ref}/montant/{montant}")
    public int payer(@PathVariable String ref, @PathVariable Float montant) {
        return commandeService.payer(ref, montant);
    }

    @GetMapping("/reference/{reference}")
    public Commande findByReference(@PathVariable String reference) {
        return commandeService.findByReference(reference);
    }

    @GetMapping("/total/{total}")
    public Commande findByTotalPayEspece(@PathVariable double total) {
        return commandeService.findByTotalPayEspece(total);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return commandeService.deleteByReference(reference);
    }

}
