package br.com.conexao.model.dao;

import br.com.conexao.model.data.Conexao;
import br.com.conexao.model.entity.Produto;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private Conexao conexao = null;

    public void produtoDAO() throws SQLException, ClassNotFoundException {
        this.conexao = new Conexao();
    }

    public void save(Produto produto) throws SQLException {
        String statement = "INSERT INTO produto(nome, preco) values (?, ?)";
        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {
            pstmt.setString(1, produto.getNome());
            pstmt.setDouble(2, produto.getPreço());

            pstmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    public List<Produto> findAll() throws SQLException {
        String statement = "select id, nome, preco from produto;";

        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {
            ResultSet resultSet = pstmt.executeQuery();
            List<Produto> produtoList = new ArrayList<>();
            while (resultSet.next()){
                Produto produtoBuscado = new Produto(


                        resultSet.getString("nome"),
                        resultSet.getDouble("preco"));


                produtoList.add(produtoBuscado);
            }
            return produtoList;
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }

    }

    public void update(String nomeAlterado, int id) throws SQLException {
        String statement = "update produto set nome = ? where id = ?";

        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {

            pstmt.setString(1, nomeAlterado);
            pstmt.setInt(2, id);

            pstmt.executeUpdate();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }

    public void delete(int id) throws SQLException{
        String statement = "delete from produto where id = ?";

        try (PreparedStatement pstmt = this.conexao.getConnection().prepareStatement(statement)) {


            pstmt.setInt(1, id);

            pstmt.execute();
            this.conexao.commit();
        } catch (SQLException e) {
            this.conexao.rollback();
            throw e;
        }
    }
}
