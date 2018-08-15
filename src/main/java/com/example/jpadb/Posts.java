package com.example.jpadb;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PostID;
    private String Post;
    private String Headline;

    @Column(name="Createddatum", insertable = false)
    private Date Createddatum;

    public Posts(){

    }

    public Posts(String post, String headline) {
        Post = post;
        Headline = headline;
    }

    public int getPostID() {
        return PostID;
    }

    public void setPostID(int postID) {
        PostID = postID;
    }

    public String getPost() {
        return Post;
    }

    public void setPost(String post) {
        Post = post;
    }

    public String getHeadline() {
        return Headline;
    }

    public void setHeadline(String headline) {
        Headline = headline;
    }

    public Date getCreateddatum() {
        return Createddatum;
    }

    public void setCreateddatum(Date createddatum) {
        Createddatum = createddatum;
    }
}
