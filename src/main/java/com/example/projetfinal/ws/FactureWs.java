package com.example.projetfinal.ws;


import com.example.projetfinal.bean.Facture;
import com.example.projetfinal.impl.FactureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Acer
 */
@RestController
@RequestMapping("/api/v1/facture")

public class FactureWs {



        @Autowired
        private FactureServiceImpl factureServiceImpl;

        @GetMapping("/ref/{ref}")
        public Facture findByRef(@PathVariable String ref) {
            return factureServiceImpl.findByRef(ref);
        }

        @PostMapping("/")
        public int save(@RequestBody Facture facture) {
            return factureServiceImpl.save(facture);
        }


        @DeleteMapping("/ref/{ref}")
        public int deleteByRef(@PathVariable String ref) {
            return factureServiceImpl.deleteByRef(ref);
        }


    }


