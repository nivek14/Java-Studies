package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConexao() throws SQLException {
        try{
            // parâmetros básicos para a conexão com o banco
            Properties prop = getProperties();
            String url = prop.getProperty("banco.url");
            String usuario = prop.getProperty("banco.usuario");
            String senha = prop.getProperty("banco.senha");

            // criando a conexão com o jdbc
            return DriverManager.getConnection(url, usuario, senha);
        }catch (SQLException | IOException e){
            throw new RuntimeException(e);
        }
    }

    private  static Properties getProperties() throws IOException {
        Properties prop = new Properties();
        String path = "/conexao.properties";
        prop.load(FabricaConexao.class.getResourceAsStream(path));
        return prop;
    }

}
