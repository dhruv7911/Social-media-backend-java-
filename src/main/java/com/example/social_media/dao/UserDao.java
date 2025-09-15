package com.example.social_media.dao;
import com.example.social_media.model.User;
import com.example.social_media.util.DatabaseUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class UserDao{
    public Boolean createUser(User user)throws SQLException{
     String sql = "INSERT INTO USERS(username, email, password_hash, email_verified, is_active, created_at) VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection con = DatabaseUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);){
                ps.setString(1,user.getUsername());
                ps.setString(2,user.getEmail());
                ps.setString(3,hashPassword(user.getPasswordHash()));
                ps.setBoolean(4,user.isEmailVerified());
                ps.setBoolean(5,user.isActive());
                ps.setDate(6,user.getCreatedAt());
                int row = ps.executeUpdate();
                ps.close();
                con.close();
                if(row>0){
                    return true;
                }else{
                    return false;
                }
        }
    }
    public Boolean isUsernameExists(String username)  throws SQLException{
        String sql = "SELECT * FROM USERS WHERE username=?";
        try(Connection con = DatabaseUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);){
            ResultSet row = ps.executeQuery();
            con.close();
            ps.close();
            if(row.next()){
                return true;
            }else{
                return false;
            }
            
        }
        
        
    }
    public Boolean isEmailExists(String email) throws SQLException{
        String sql = "SELECT * FROM USERS WHERE email=?";
        try{
            Connection con = DatabaseUtil.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet row = ps.executeQuery();
            con.close();
                ps.close();
            if(row.next()){
                return true;
            }else{
                return false;
            }
            
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        

    }
    private String hashPassword(String password){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return password;
        }
    }
}