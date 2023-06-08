package com.example.tp_note_archilog.DAO;
import com.example.tp_note_archilog.Modele.Pizza;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaDAO {

    public List<Pizza> getPizzas() {
        List<Pizza> pizzas = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza", "root", "root");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select nom, prix, nbrIngredients from pizza");
            while (rs.next()) {
                pizzas.add(new Pizza(rs.getString(1),rs.getString(2),rs.getInt(3)));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return pizzas;
    }

    public void ajouterPizzaBDD(Pizza pizza) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza", "root", "root");

            PreparedStatement statement = con.prepareStatement("INSERT INTO pizza(nom, prix, nbrIngredients) VALUES(?,?,?)");
            statement.setString(1,pizza.getNom());
            statement.setString(2,pizza.getPrix());
            statement.setInt(3,pizza.getNombreIngredients());

            statement.executeUpdate();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void supprimerPizzaBDD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza", "root", "root");

            PreparedStatement statement = con.prepareStatement("DELETE FROM pizza");

            statement.executeUpdate();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
