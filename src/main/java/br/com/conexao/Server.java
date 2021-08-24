package br.com.conexao;


import br.com.conexao.model.dao.AnimalDAO;
import br.com.conexao.model.entity.Animal;


import java.sql.SQLException;


public class Server {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

     /*   Animal a = new Animal("Tuti", "papagaio", 5, "macho");
        AnimalDAO dao = new AnimalDAO();
        dao.save(a);*/



        AnimalDAO dao = new AnimalDAO();
        dao.delete( 4);






    }

}

