package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa1 {

    public static void main(String[] args) throws SQLException {

        Connection connection = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";

        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(sql);

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


    }

}
