package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {

    Connection conn;
    
    public void conectar() throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/casa_da_limpeza";
        String user = "root";
        String pass = "";
        
        conn = DriverManager.getConnection(url, user, pass);
    }
    
    public void desconectar() throws Exception{
        
        if (!conn.isClosed()) {
            conn.close();
        }
    }
    
}
