package br.com.conexao;


import br.com.conexao.model.dao.AnimalDAO;
import br.com.conexao.model.entity.Animal;
import br.com.conexao.model.entity.Cachorro;
import br.com.conexao.model.entity.Gato;
import br.com.conexao.model.entity.Girafa;


import java.sql.SQLException;


public class Server {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Animal g = new Gato("Jota", 48, "Macho" );
        System.out.println(g);
        g.som();
        g.morrer();
        if (g.isAdulto()) {
            System.out.println("adulto");
        }else{
            System.out.println("filhote");
        }

      /*    AnimalDAO sinDao = new AnimalDAO();
        sinDao.save(g);

        System.out.println("      ");


        Animal j = new Cachorro("Loki", 12, "macho");

        System.out.println(j);

        j.som();

        if (j.isAdulto()) {
            System.out.println("adulto");
        }else{
            System.out.println("filhote");
        }

        AnimalDAO siDao = new AnimalDAO();
        siDao.save(j);
        j.dormir();
        System.out.println("      ");

        Animal c = new Girafa("regina", 36, "femea");
        System.out.println(c);
        c.som();
        c.dormir();
        if (c.isAdulto()) {
            System.out.println("adulto");
        }else{
            System.out.println("filhote");
        }
       AnimalDAO sDao = new AnimalDAO();
        sDao.save(c);
        */



    }

}

