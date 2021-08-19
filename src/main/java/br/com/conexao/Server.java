package br.com.conexao;

import br.com.conexao.model.dao.AnimalDAO;
import br.com.conexao.model.entity.Animal;

import java.sql.SQLException;

public class Server {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Animal animal = new Animal("Zico", "Gato", 1, "macho");

        Animal dao = new AnimalDAO();
        dao.save(animal);
    }
}