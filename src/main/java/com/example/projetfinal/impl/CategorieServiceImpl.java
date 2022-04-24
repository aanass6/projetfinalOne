package com.example.projetfinal.impl;


import com.example.projetfinal.bean.Categorie;
import com.example.projetfinal.dao.CategorieDao;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategorieServiceImpl {
    @Autowired
    private CategorieDao categorieDao;

    public int save(Categorie categorie){
        if (findByLibelle(categorie.getLibelle())!=null){
            return -1;
        }
        else{
            categorieDao.save(categorie);
            return 1;
        }
    }

    public List<Categorie> findByLibelle(String libelle) {
        return categorieDao.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return categorieDao.deleteByLibelle(libelle);
    }

    @NotNull
    public List<Categorie> findAll() {
        return categorieDao.findAll();
    }
}
