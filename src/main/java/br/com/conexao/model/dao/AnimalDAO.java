package br.com.conexao.model.dao;

import br.com.conexao.model.data.Conexao;
import br.com.conexao.model.entity.Animal;

import java.sql.PreparedStatement;
import java.sql.SQLException;

// Classe que irá conecatar a informacao do user com o banco
// DAO = Data Access Object
public class AnimalDAO {
    private Conexao conexao = null;

    public AnimalDAO() throws SQLException, ClassNotFoundException {
        this.conexao = new Conexao();
    }

    public void save(Animal animal) throws SQLException {

        String statement = "INSERT INTO animal(nome, especie, idade, sexo) values (?, ?, ?,?)";
        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {
            pstmt.setString(1, animal.getNome());
            pstmt.setString(2, animal.getEspecie());
            pstmt.setInt(3, animal.getIdade());
            pstmt.setString(4, animal.getSexo());
            pstmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }
}
