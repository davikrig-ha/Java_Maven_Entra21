package br.com.conexao;

import br.com.conexao.model.dao.AnimalDAO;
import br.com.conexao.model.entity.Animal;

import java.sql.SQLException;

public class Server {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Animal a = new Animal("JUJU", "Girafa", 5, "femea");
        AnimalDAO dao = new AnimalDAO();
        dao.save(a);
    }
}