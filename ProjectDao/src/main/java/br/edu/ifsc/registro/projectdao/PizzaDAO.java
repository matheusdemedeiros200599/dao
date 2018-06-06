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
public interface PizzaDAO {

    public void create(String nome) throws SQLException;

    public List<Pizza> retrieve() throws SQLException;

    public void update(Pizza p) throws SQLException;

    public void delete(Pizza p) throws SQLException;
}
