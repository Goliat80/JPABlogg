package com.example.jpadb;

<<<<<<< HEAD
import javax.persistence.*;
import java.util.Date;
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
>>>>>>> 84bcfb4f88f0000e9a448c3067e528011697dbad

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
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
=======
    private int UserID;
    private String username;
    private String password;
    private String email;

  //  private Date createdDatum;
>>>>>>> 84bcfb4f88f0000e9a448c3067e528011697dbad

    public Users() {

    }

<<<<<<< HEAD

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
=======
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
>>>>>>> 84bcfb4f88f0000e9a448c3067e528011697dbad
}