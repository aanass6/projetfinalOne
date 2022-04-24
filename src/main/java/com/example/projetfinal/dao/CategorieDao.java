package com.example.projetfinal.dao;

import com.example.projetfinal.bean.Categorie;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategorieDao extends JpaRepository<Categorie, Long> {
    List<Categorie> findByLibelle(String libelle);
    int deleteByLibelle(String libelle);

    @Override
    @NotNull
    List<Categorie> findAll();
}
