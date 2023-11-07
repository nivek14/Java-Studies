package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) throws SQLException {

        String sql;
        PreparedStatement stmt;

        // criando conexao e o scanner do nome
        Connection connection = FabricaConexao.getConexao();
        Scanner scanner = new Scanner(System.in);
        String novoNome = scanner.next();

        // adicionando uma pessoa nova no bd
        Pessoa pessoa = new Pessoa(100, "teste");
        sql = "INSERT INTO pessoas (nome) VALUES (?)";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1,pessoa.getNome());
        stmt.execute();

        // atualizando registro da pessoa adicionada no bd
        sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
        stmt = connection.prepareStatement(sql);
        stmt.setString(1,novoNome);
        stmt.setInt(2,pessoa.getCodigo());
        stmt.execute();

        stmt.close();
        connection.close();
        scanner.close();

    }

}
