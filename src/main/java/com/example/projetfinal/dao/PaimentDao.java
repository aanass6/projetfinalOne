/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.projetfinal.dao;

import java.util.List;

import com.example.projetfinal.bean.Paiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Acer
 */
@Repository
public interface PaimentDao  extends JpaRepository<Paiment, Long>{
    Paiment findByTypePaiement( String typePaiement);
    int deleteByTypePaiement(String typePaiement);
    
    
    
}
