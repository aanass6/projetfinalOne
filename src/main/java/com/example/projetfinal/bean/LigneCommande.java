/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.projetfinal.bean;

import javax.persistence.*;

/**
 *
 * @author Acer
 */
@Entity
public class LigneCommande {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private double prix;
   private double quantite;
   private double quantiteReception;
   @ManyToOne
   private Produit produit ;
   @ManyToOne
   private Commande commande ;

   public LigneCommande() {
   }

   public LigneCommande(Long id, double prix, double quantite, double quantiteReception, Produit produit, Commande commande) {
      this.id = id;
      this.prix = prix;
      this.quantite = quantite;
      this.quantiteReception = quantiteReception;
      this.produit = produit;
      this.commande = commande;
   }

   @Override
   public String toString() {
      return "LigneCommande{" +
              "id=" + id +
              ", prix=" + prix +
              ", quantite=" + quantite +
              ", quantiteReception=" + quantiteReception +
              ", produit=" + produit +
              ", commande=" + commande +
              '}';
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public double getPrix() {
      return prix;
   }

   public void setPrix(double prix) {
      this.prix = prix;
   }

   public double getQuantite() {
      return quantite;
   }

   public void setQuantite(double quantite) {
      this.quantite = quantite;
   }

   public double getQuantiteReception() {
      return quantiteReception;
   }

   public void setQuantiteReception(double quantiteReception) {
      this.quantiteReception = quantiteReception;
   }

   public Produit getProduit() {
      return produit;
   }

   public void setProduit(Produit produit) {
      this.produit = produit;
   }

   public Commande getCommande() {
      return commande;
   }

   public void setCommande(Commande commande) {
      this.commande = commande;
   }
}
