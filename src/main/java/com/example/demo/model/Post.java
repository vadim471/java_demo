package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
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

}
