package com.example.tp_note_archilog.Modele;

import javafx.collections.ObservableList;

public class Pizza {
    private int id;
    private String nom;
    private Double prix;
    private Integer nombreIngredients;


    public Pizza(String nom, Double prix, int nombreIngredients) {
        this.nom = nom;
        this.prix = prix;
        this.nombreIngredients = nombreIngredients;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public Double setPrix(Double prix) {
        this.prix = prix;
        return this.prix;
    }

    public int getNombreIngredients() {
        return nombreIngredients;
    }

    public void setNombreIngredients(Integer nombreIngredients) {
        this.nombreIngredients = nombreIngredients;
    }

    public void add(ObservableList<Pizza> pizzas) {
    }
}
