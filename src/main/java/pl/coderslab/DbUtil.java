package pl.coderslab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static final String DB_URL1 = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "workshop2";
    private static final String DB_URL2 = "?useSSL=false&characterEncoding=utf8";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "coderslab";

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(DB_URL1+DB_NAME+DB_URL2, DB_USER, DB_PASS);
    }
}


