package br.com.conexao.model.dao;

import br.com.conexao.model.data.Conexao;
import br.com.conexao.model.entity.Animal;
import br.com.conexao.model.entity.Pessoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {
    private Conexao conexao = null;

    public PessoaDAO() throws SQLException, ClassNotFoundException {
        this.conexao = new Conexao();
    }

    public void save(Pessoa pessoa) throws SQLException {

        String statement = "INSERT INTO pessoa(nome, idade, cpf, endereco) values (?, ?, ?,?)";
        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {
            pstmt.setString(1, pessoa.getNome());
            pstmt.setInt(2, pessoa.getIdade());
            pstmt.setString(3, pessoa.getCpf());
            pstmt.setString(4, pessoa.getEndereco());
            pstmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    public List<Pessoa> findAll() throws SQLException {
        String statement = "select nome, idade, cpf, endereco from pessoa;";

        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {
            ResultSet resultSet = pstmt.executeQuery();

            List<Pessoa> pessoaList = new ArrayList<>();

            while (resultSet.next()){
                Pessoa pessoaBuscado = new Pessoa(resultSet.getString("nome"),
                        resultSet.getInt("idade"),
                        resultSet.getString("cpf"),
                        resultSet.getString("endereco"));

                pessoaList.add(pessoaBuscado);
            }
            return pessoaList;

        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }
}
