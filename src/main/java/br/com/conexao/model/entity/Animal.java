package br.com.conexao.model.entity;

import java.sql.SQLException;

public class Animal {

    //propriedades
    private String nome;
    private String especie;
    private int idade;
    private String sexo;

    public Animal() {
    }

    public Animal(String nome, String especie, int idade, String sexo) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void save(Animal animal) throws SQLException {
    }
}
