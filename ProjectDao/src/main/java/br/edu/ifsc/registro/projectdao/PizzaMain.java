/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.registro.projectdao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class PizzaMain {

    public static void main(String[] args) throws SQLException {
        PizzaDAO pizza = new PizzaDAOPG();
        pizza.create("Calabresa");
        pizza.create("Muzzarela");
        List<Pizza> pizzaList = pizza.retrieve();
        for (Pizza p : pizzaList) {
            System.out.println(p.getNome());
        }
    }

}
