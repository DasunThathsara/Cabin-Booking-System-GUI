package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db {
    private static String HOST = "localhost";
    private static int PORT = 8080;
    private static String DB_NAME = "hotel";
    private static String USERNAME = "root";
    private static String PASSWORD = "";
    private static Connection connection;


    public static Connection getConnection (){
        try {
            connection = DriverManager.getConnection((String.format("jdbc:mysql://%s:%d/%s", HOST, PORT, DB_NAME)));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return connection;
    }
}
