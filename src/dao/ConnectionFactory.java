package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Fernando Xavier
 */
public class ConnectionFactory {
    
    public Connection getConexao() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/locadora?useTimezone=true&serverTimezone=UTC", "root", "admin");
        } catch (Exception erro){
            throw new RuntimeException("Erro 1:" + erro);
        }
    }

}
