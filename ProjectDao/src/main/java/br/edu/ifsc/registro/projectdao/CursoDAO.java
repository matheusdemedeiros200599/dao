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
public interface CursoDAO {

    public void create(String nome, String tipoCurso) throws SQLException;

    public List<Curso> retrieve() throws SQLException;

    public void update(Curso c) throws SQLException;

    public void delete(Curso c) throws SQLException;

}
