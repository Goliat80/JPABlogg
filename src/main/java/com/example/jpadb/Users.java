package com.example.jpadb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;
    private String username;
    private String password;
    private String email;

  //  private Date createdDatum;

    public Users() {

    }

    public Users(String name) {
        this.username = name;
    }

    public Users(String userName, String password, String email) {
        this.username = userName;
        this.password = password;
        this.email = email;

    }


    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  /*  public Date getcreatedDatum() { return createdDatum;
    }

    public void setCreatedDatum(Date createdDatum) { this.createdDatum = createdDatum;
    }*/
}