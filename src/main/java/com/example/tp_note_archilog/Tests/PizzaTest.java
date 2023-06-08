package com.example.tp_note_archilog.Tests;

import com.example.tp_note_archilog.Modele.Pizza;

public class PizzaTest {
    // Getter Nom (Recette) de l'instanciation de la Pizza
    public static void main(String args[]) {
        Pizza pizza = new Pizza("Margherita", "13", 3);
        String testNom = pizza.getNom();
        System.out.println(testNom); // Résultat attendu : Margherita

        // Setter Prix de l'instanciation de la Pizza
        System.out.println(pizza.getPrix()); // Résultat initial : 13
        String changementPrix = pizza.setPrix("11"); // Changement avec le Setter
        System.out.println(changementPrix); // Résultat attendu : 11

        // Constructeur de la classe Pizza
        System.out.println(pizza.getNom()); // Resultat attendu : Margherita
        System.out.println(pizza.getPrix()); // Resultat attendu : 11
        System.out.println(pizza.getNombreIngredients()); // Resultat attendu : 3
    }
}
