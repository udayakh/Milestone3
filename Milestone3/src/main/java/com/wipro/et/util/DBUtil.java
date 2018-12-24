package com.wipro.et.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static Connection con;
    static final   String driverClass = "com.mysql.jdbc.Driver";
    static final  String url = "jdbc:mysql://localhost:3306/devops";
    static final  String username = "root";
    static final  String password = "root";
    private static class db_helper
    {
        private static final DBUtil INSTANCE = new DBUtil();
    }

    public static DBUtil getInstance(){

        return db_helper.INSTANCE;
    }

    public static void makeCon() {
        try {
            Class.forName(driverClass);

            con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getCon() throws SQLException {
        if(con==null)
        {
            try {
                Class.forName(driverClass);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            con = DriverManager.getConnection(url, username, password);
        } else {
            try {
                Class.forName(driverClass);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            con = DriverManager.getConnection(url, username, password);
        }
        return con;
    }

    public void closeCon() {
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
