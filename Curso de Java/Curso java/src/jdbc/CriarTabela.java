package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {

    public static void main(String[] args) throws SQLException {

        Connection connection = FabricaConexao.getConexao();

        String sql = "CREATE TABLE IF NOT EXISTS pessoas ( codigo INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(80) NOT NULL)";

        Statement stmt = connection.createStatement();
        stmt.execute(sql);

        connection.close();

    }

}
