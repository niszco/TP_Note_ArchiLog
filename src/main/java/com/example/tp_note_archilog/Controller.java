package com.example.tp_note_archilog;

import com.example.tp_note_archilog.DAO.PizzaDAO;
import com.example.tp_note_archilog.Modele.Pizza;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import static java.lang.Integer.parseInt;

public class Controller implements Initializable {
    @FXML
    private TableView<Pizza> PizzaView;
    @FXML
    private TableColumn<Pizza, String> recetteNom;
    @FXML
    private TableColumn<Pizza, String> prix;
    @FXML
    private TableColumn<Pizza, Integer> nbrIngredients;
    @FXML
    private TextField recetteNomText;
    @FXML
    private TextField prixText;
    @FXML
    private TextField nbrIngredientsText;
    @FXML
    private Button btnAjouterPizza;
    @FXML
    private Button btnViderTab;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        recetteNom.setCellValueFactory(new PropertyValueFactory<Pizza, String>("nom"));
        prix.setCellValueFactory(new PropertyValueFactory<Pizza, String>("prix"));
        nbrIngredients.setCellValueFactory(new PropertyValueFactory<Pizza, Integer>("nombreIngredients"));


        PizzaDAO test = new PizzaDAO();
        test.supprimerPizzaBDD();
        test.ajouterPizzaBDD(new Pizza("Calzone", "12", 4));
        test.ajouterPizzaBDD(new Pizza("Flame", "15", 6));
        test.ajouterPizzaBDD(new Pizza("Spicy", "14", 3));
        test.ajouterPizzaBDD(new Pizza("4 Fromages", "17", 3));
        List<Pizza> fetchPizza = test.getPizzas();
        ajouterPizzaDansTableau(fetchPizza);
    }

    @FXML
    public void ajouterPizzaDansTableau(List<Pizza> pizzas) {
        ObservableList<Pizza> pizzaList = FXCollections.observableArrayList(pizzas);
        PizzaView.setItems(pizzaList);
    }

    @FXML
    private void ajouterPizza() {
        String recette = recetteNomText.getText();
        String prix = prixText.getText();
        Integer nbrIngredients = parseInt(nbrIngredientsText.getText());

        Pizza nouvellePizza = new Pizza(recette, prix, nbrIngredients);
        PizzaDAO pizzaDAO = new PizzaDAO();
        pizzaDAO.ajouterPizzaBDD(nouvellePizza);

        List<Pizza> pizzas = pizzaDAO.getPizzas();
        ajouterPizzaDansTableau(pizzas);

        recetteNomText.clear();
        prixText.clear();
        nbrIngredientsText.clear();
    }


    @FXML
    public void viderTableau() {
        ObservableList<Pizza> pizzas = PizzaView.getItems();
        pizzas.clear();
        PizzaDAO deleteAllBDD = new PizzaDAO();
        deleteAllBDD.supprimerPizzaBDD();
    }
}