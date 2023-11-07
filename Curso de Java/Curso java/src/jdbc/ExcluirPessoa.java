package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        int codigo = scanner.nextInt();

        Connection connection = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1,codigo);

        if(stmt.executeUpdate() > 0){
            System.out.println("pessoa excluida");
        }
        else System.out.println("nada foi feito");

        connection.close();
        scanner.close();

    }
}
