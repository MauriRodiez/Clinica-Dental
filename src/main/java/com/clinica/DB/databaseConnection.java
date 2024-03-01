package com.clinica.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnection {

    private static Connection dbConnect;

    private static final String DB_URL = "jdbc:h2:C:/Users/Mauricio/Documents/CV/BD/JAVA";

    Static{

        try {
            Class.forName("org.h2.Driver");

            try {
                dbConnect = DriverManager.getConnection(DB_URL);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getDbConnect() {
        return dbConnect;
    }
}
