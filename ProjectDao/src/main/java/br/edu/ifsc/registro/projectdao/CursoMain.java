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
public class CursoMain {

    public static void main(String[] args) throws SQLException {
        CursoDAO curso = new CursoDAOPG();
        curso.create("CC", "Graduação");
        curso.create("Técnico em informática", "Nível Técnico");

    }
}
