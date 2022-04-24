/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.projetfinal.dao;

import com.example.projetfinal.bean.Paiment;
import com.example.projetfinal.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Acer
 */
@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {
    Produit findByReference(Long reference);
    int deleteByReference(Long reference);

}
