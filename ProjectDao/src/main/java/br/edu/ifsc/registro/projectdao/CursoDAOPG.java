/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.registro.projectdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class CursoDAOPG implements CursoDAO {

    @Override
    public void create(String nome, String tipoCurso) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dao", "postgres", "aluno");
        PreparedStatement prst = conn.prepareStatement("INSERT INTO curso(nome, tipoCurso) VALUES (?,?)");
        prst.setString(1, nome);
        prst.setString(2, tipoCurso);
        prst.execute();
        prst.close();
    }

    @Override
    public List<Curso> retrieve() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Curso c) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Curso c) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
