/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.registro.projectdao;

/**
 *
 * @author Aluno
 */
public class Curso {

    private Integer id;
    private String nome;
    private String tipoCurso;

    public Curso(Integer id, String nome, String tipoCurso) {
        this.id = id;
        this.nome = nome;
        this.tipoCurso = tipoCurso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

}
