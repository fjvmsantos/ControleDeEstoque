package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConexao {

    public static Connection abrirConexao() {

        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/estoque?";
            url += "user=root&password=";
            con = DriverManager.getConnection(url);

            System.out.println("Conexão realizada com sucesso!");

        } catch (SQLException e) {

            System.out.println(e.getMessage() + "Falha no SQLException");

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage() + "Erro ao instanciar a classe conexão!");

        } catch (Exception e) {

            System.out.println(e.getMessage() + "Erro de Exceção!");

        }

        return con;

    }

    public static void fecharConexao(Connection con) {

        try {

            con.close();

            System.out.println("Conexão Fechada!");

        } catch (SQLException e) {

            System.out.println(e.getMessage() + "Erro no método fechar conexão!");

        } catch (Exception e) {

            System.out.println(e.getMessage() + "Erro no método fechar conexão!");

        }

    }

}