package br.com.conexao.model.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    private Connection connection = null;

    //driver de conexão do banco de dados
    private String DRIVER = "com.mysql.cj.jdbc.Driver";

    //caminho do banco dentro da maquina ou do servidor

    private static final String DATABASE_URL =
            "jdbc:mysql://localhost:3306/zoo?useTimezone=true&serverTimezone=UTC";

    //USUARIO DO BANCO
    private static final String USERNAME = "root";

    //SENHA DO BANCO
    private static final String PASSWORD = "";

    public Conexao() throws SQLException, ClassNotFoundException {

        Class.forName(DRIVER);
        this.connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        this.connection.setAutoCommit(false);
    }

    public Connection getConnection(){
        return this.connection;
    }

    public void close(){
        if (this.connection != null){
            try{
                this.connection.close();
            }catch (SQLException e){
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public void commit() throws SQLException {
        this.connection.commit();
        this.close();
    }

    public void rollback() {
        if (this.connection != null) {
            try {
                this.connection.rollback();
            } catch (SQLException e) {
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
            }finally {
                this.close();
            }
        }
    }
}
