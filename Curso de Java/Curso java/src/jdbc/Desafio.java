package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) throws SQLException {

        Connection connection = FabricaConexao.getConexao();

        Scanner scanner = new Scanner(System.in);
        String busca = scanner.nextLine();

        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,"%" + busca + "%");
        ResultSet resultSet = stmt.executeQuery();

        // lista que vai armazenar os dados do bd
        List<Pessoa> pessoaList = new ArrayList<>();

        // percorrendo os resultados da query acima
        while (resultSet.next()){
            int codigo = resultSet.getInt("codigo");
            String nome = resultSet.getString("nome");
            pessoaList.add(new Pessoa(codigo,nome));
        }

        stmt.close();
        connection.close();
        scanner.close();

    }

}
