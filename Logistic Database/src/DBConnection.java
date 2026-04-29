package com.gla;
import java.sql.*;

class DBConnection {
    static final String URL = "jdbc:mysql://localhost:3306/route_tracker";
    static final String USER = "root";
    static final String PASS = "jitesh123";

    static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
