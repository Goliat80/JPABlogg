package com.example.jpadb;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Userid;
    private String Username;
    private String Password;
    private String Email;

    @Column(name="Createddatum", insertable=false)
    private Date Createddatum;

    public Users(String username, String password, String email) {
        Username = username;
        Password = password;
        Email = email;
    }

    public Users() {

    }


    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Date getCreateddatum() {
        return Createddatum;
    }

    public void setCreateddatum(Date createddatum) {
        Createddatum = createddatum;
    }
}