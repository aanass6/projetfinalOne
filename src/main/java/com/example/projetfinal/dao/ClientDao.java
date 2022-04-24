/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.projetfinal.dao;

import com.example.projetfinal.bean.Client;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author Acer
 */
@Repository
public interface ClientDao extends JpaRepository<Client, Long>{
    
    
    Client findByCin(String cin);
    int deleteByCin(String cin);
    @NotNull List<Client> findAll();
}
