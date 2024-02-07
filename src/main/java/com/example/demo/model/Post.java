package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public Date getCreationDate(){ return  creationDate; }

    public Post(String text, Date date){
        this.text = text;
        this.likes = 0;
        this.creationDate = date;
    }

}
