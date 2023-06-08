package com.example.tp_note_archilog.Tests;

import static org.junit.jupiter.api.Assertions.*;

import com.example.tp_note_archilog.Modele.Pizza;
import org.junit.jupiter.api.Test;

class PizzaTest {
    Pizza pizza = new Pizza("Margherita", 13.00, 3);
    @Test
    public void getNom() {
        assertEquals("Margherita",pizza.getNom());
        // Résultat attendu : Margherita;
    }
    @Test
    public void setPrix() {
        assertEquals(11.0, pizza.setPrix(11.0));
        // Résultat attendu : 11.0;
    }
    @Test
    public void testConstructor() {
        assertEquals("Margherita",pizza.getNom());
        // Résultat attendu : Margherita;
        assertEquals(13.0, pizza.getPrix());
        // Résultat attendu : 13.0;
        assertEquals(3,pizza.getNombreIngredients());
        // Résultat attendu : 3;
    }
}