package br.com.conexao;


import br.com.conexao.model.dao.AnimalDAO;
import br.com.conexao.model.dao.PessoaDAO;
import br.com.conexao.model.entity.Pessoa;

import java.sql.SQLException;

public class Server {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

       /* Pessoa p = new Pessoa("Raul Seixas", 44, "743", "sociedade alternativa");
        PessoaDAO dao = new PessoaDAO();
        dao.save(p);*/

        PessoaDAO daoLista = new PessoaDAO();


        System.out.println(daoLista.findAll());
        }

    }
