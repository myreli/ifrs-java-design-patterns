package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoPostgreSQL {
    
	private static final String host = "localhost";
    private static final String user = "postgres";
    private static final String password = "postgres";
    private static final String dbname = "keep";
    private static final String port = "5432";
    
    private static Connection connection;

    public static void close() throws SQLException {
        ConexaoPostgreSQL.connection.close();
    }

    private ConexaoPostgreSQL() { } 
    
    public static synchronized Connection getConnection(){
        String url = "jdbc:postgresql://"+ConexaoPostgreSQL.host+":"+ConexaoPostgreSQL.port+"/"+ConexaoPostgreSQL.dbname;        
        try {
            if (ConexaoPostgreSQL.connection == null){
                ConexaoPostgreSQL.connection = DriverManager.getConnection(url, ConexaoPostgreSQL.user, ConexaoPostgreSQL.password);
            }
            return ConexaoPostgreSQL.connection;
        } catch (SQLException e) {
        	System.out.println("Não foi possível estabelecer conexão com o banco de dados...");
            
            Logger.getLogger(ConexaoPostgreSQL.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    } 
}
