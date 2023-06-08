package com.example.tp_note_archilog.Modele;

import javafx.collections.ObservableList;

public class Pizza {
    private int id;
    private String nom;
    private String prix;
    private Integer nombreIngredients;


    public Pizza(String nom, String prix, int nombreIngredients) {
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

    public String getPrix() {
        return prix;
    }

    public String setPrix(String prix) {
        this.prix = prix;
        return prix;
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
