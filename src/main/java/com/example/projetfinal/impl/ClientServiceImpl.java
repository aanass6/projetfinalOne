/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.impl;

import com.example.projetfinal.bean.Client;
import com.example.projetfinal.dao.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Acer
 */
@Service
public class ClientServiceImpl {
    @Autowired
    private ClientDao clientDao;

    public int save(Client client) {
        if (findByCin(client.getCin()) != null) {
            return -1;
        } else {
            clientDao.save(client);
            return 1;
        }
    }

    public Client findByCin(String cin) {
        return clientDao.findByCin(cin);
    }

    public int deleteByCin(String cin) {
        return clientDao.deleteByCin(cin);
    }

    public List<Client> findAll() {
        return clientDao.findAll();
    }
}
