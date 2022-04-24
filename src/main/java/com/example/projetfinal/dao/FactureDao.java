/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.projetfinal.dao;

import java.util.List;

import com.example.projetfinal.bean.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Acer
 */
@Repository
public interface FactureDao extends JpaRepository<Facture, Long> {

    Facture findByRef(String ref);

    int deleteByRef(String ref);

}
