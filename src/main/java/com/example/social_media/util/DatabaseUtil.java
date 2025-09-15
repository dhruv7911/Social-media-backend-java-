package com.example.social_media.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseUtil{
    private static final String url="jdbc:mysql://localhost:3306/social_media";
    private static final String USER="root";
    private static final String PASSWORD="";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,USER,PASSWORD);
    }
    public static void close(Connection conn){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}