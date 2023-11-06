package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() throws SQLException {
        try{
            // parâmetros básicos para a conexão com o banco
            String url = "jdbc:mysql://localhost";
            String usuario = "root";
            String senha = "123456";

            // criando a conexão com o jdbc
            return DriverManager.getConnection(url, usuario, senha);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
