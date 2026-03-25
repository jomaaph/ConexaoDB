package scr;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    // Configurações da tua base de dados no Docker
    private static final String URL = db.url;
    private static final String USER = db.user;
    private static final String PASS = db.password; // A senha que definiste no Docker

    public static void main(String[] args) {
        try {
            // 1. Tentar estabelecer a conexão
            Connection conexao = DriverManager.getConnection(URL, USER, PASS);
            
            if (conexao != null) {
                System.out.println("✅ Sucesso: Java conectou ao MySQL no Docker!");
                conexao.close();
            }
        } catch (SQLException e) {
            System.err.println("❌ Erro de Conexão: " + e.getMessage());
            System.err.println("Dica: Verifica se o comando 'db-start' foi executado no Bash.");
        }
    }
}