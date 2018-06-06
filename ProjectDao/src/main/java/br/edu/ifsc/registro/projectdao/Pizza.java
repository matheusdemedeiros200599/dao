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
public class Pizza {

    private Integer id;
    private String nome;

    public Pizza(Integer id, String nome) {
        this.id = id;
        this.nome = nome;

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

}
