/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.registro.projectdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class PizzaDAOPG implements PizzaDAO {

    @Override
    public void create(String nome) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dao", "postgres", "aluno");
        Statement st = conn.createStatement();
        String sql = "INSERT INTO pizza(nome) VALUES ('" + nome + "');";
        st.execute(sql);
        st.close();
    }

    @Override
    public List<Pizza> retrieve() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dao", "postgres", "aluno");
        Statement st = conn.createStatement();
        String sql = "SELECT * FROM pizza;";
        ResultSet rs = st.executeQuery(sql);
        List<Pizza> pizzaList = new ArrayList<>();
        while (rs.next()) {
            Integer id = rs.getInt("id");
            String nome = rs.getString("nome");
            Pizza p = new Pizza(id, nome);
            pizzaList.add(p);
        }
        rs.close();
        return pizzaList;
    }

    @Override
    public void update(Pizza p) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Pizza p) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
