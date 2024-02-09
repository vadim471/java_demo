package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    @Id
    @GeneratedValue
    private Long id;

    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public Date getCreationDate(){ return  creationDate; }
    public void setLikes(Integer like){ this.likes = like; }
    public Long getId(){
        return this.id;
    }
    public Post(Long id, String text, Date date){
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = date;
    }
    public Post() {

    }
}
