/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.ws;

import com.example.projetfinal.bean.Paiment;
import com.example.projetfinal.impl.PaimentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Acer
 */
@RestController
@RequestMapping("/api/v1/paiment")
public class PaimentWs {
    @Autowired
    private PaimentServiceImpl paimenServicetImpl;

@PostMapping("/")
    public int save(@RequestBody  Paiment paiment) {
        return paimenServicetImpl.save(paiment);
    }
@GetMapping("/typePaiment/{typePaiment}")

    public Paiment findByRef(@PathVariable String typePaiment) {
        return paimenServicetImpl.findByTypePaiement(typePaiment);
    }

@DeleteMapping("/typePaiment/{typePaiment}")
    public int deleteByTypePaiement(String typePaiement) {
        return paimenServicetImpl.deleteByTypePaiement(typePaiement);
    }
}
