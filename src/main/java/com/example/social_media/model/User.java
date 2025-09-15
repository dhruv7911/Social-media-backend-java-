package com.example.social_media.model;
import java.sql.Date;
public class User{
    private String user_id;
    private String username;
    private String email;
    private String password_hash;
    private boolean email_verified;
    private boolean is_active;
    private Date created_at;

    public void User(String user_id,String username,String email,String password_hash,Boolean email_verified,Boolean is_active,Date created_at){
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.password_hash = password_hash;
        this.email_verified = email_verified;
        this.is_active = is_active;
        this.created_at = created_at;
    }
 
    public String getUserId(){
        return this.user_id;
    }
    public void setUserId(String x){
        this.user_id = x;
    }
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String x){
        this.username = x;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String x){
        this.email = x;
    }
    public String getPasswordHash(){
        return this.password_hash;
    }
    public void setPasswordHash(String x){
        this.password_hash = x;
    }
    public boolean isEmailVerified(){
        return this.email_verified;
    }
    public void setEmailVerified(Boolean x){
        this.email_verified = x;
    }
    public boolean isActive(){
        return this.is_active;
    }
    public void setIsActive(Boolean x){
        this.is_active = x;
    }
    public Date getCreatedAt(){
        return this.created_at;
    }
    public void setCreatedAt(Date x){
        this.created_at = x;
    }

    
}
