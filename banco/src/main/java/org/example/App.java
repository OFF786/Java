package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        Connection conexao = null;

        try {
            // Estabelecendo a conexão com o banco de dados Oracle
            conexao = DriverManager.getConnection(
                    "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                    "usuario", "senha");

            System.out.println("Conexão realizada com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        } finally {
            // Garantindo que a conexão seja fechada
            if (conexao != null) {
                try {
                    conexao.close();
                    System.out.println("Conexão fechada com sucesso.");
                } catch (SQLException e) {
                    System.err.println("Erro ao fechar a conexão: " + e.getMessage());
                }
            }
        }
    }
}
