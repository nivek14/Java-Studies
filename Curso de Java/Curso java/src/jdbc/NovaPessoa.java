package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();

        Connection connection = FabricaConexao.getConexao();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,nome);

        stmt.execute();

        scanner.close();

    }

}
