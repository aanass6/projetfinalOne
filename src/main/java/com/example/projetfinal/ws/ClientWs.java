/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.ws;

import com.example.projetfinal.bean.Client;
import com.example.projetfinal.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Acer
 */

@RestController
@RequestMapping("/api/v1/client")

public class ClientWs {
    @Autowired
    private ClientServiceImpl clientImpl;

    @PostMapping("/")
    public int save(@RequestBody Client client) {
        return clientImpl.save(client);
    }

    @GetMapping("/cin/{cin}")
    public Client findByCin(@PathVariable String cin) {
        return clientImpl.findByCin(cin);
    }

    @GetMapping("/")
    public List<Client> findAll() {
        return clientImpl.findAll();
    }

    @DeleteMapping("/cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return clientImpl.deleteByCin(cin);


    }


}


