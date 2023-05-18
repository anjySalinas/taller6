package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicConnectionSingleton {

    private static String url = "jdbc:mysql://localhost:3306/MyApp?serverTimezone=America/Bogota";
    private static String user = "MyApp";
    private static String pass = "sena1234";
    private static Connection conn;
    public static Connection getInstance()
            throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(url, user, pass);
        }
        return conn;
    }
} // BasicConnectionSingleton

