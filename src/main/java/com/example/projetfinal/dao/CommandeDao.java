/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.projetfinal.dao;

import com.example.projetfinal.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Acer
 */
@Repository
public interface CommandeDao extends JpaRepository<Commande, Long> {
    Commande findByRef(String reference);

    Commande findByTotalPayEspece(double total);

    int deleteByRef(String reference);

}
