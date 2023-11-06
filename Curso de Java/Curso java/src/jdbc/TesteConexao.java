package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {

        // parâmetros básicos para a conexão com o banco
        String url = "jdbc:mysql://localhost";
        String usuario = "root";
        String senha = "123456";

        // criando a conexão com o jdbc
        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        conexao.close();

    }
}
