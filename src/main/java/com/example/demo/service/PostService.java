package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts = new ArrayList<>();

    public PostService(){
        posts.add(new Post( (long) posts.size(), "post1", new Date()));
    }

    public void create(String text) {
        posts.add(new Post( (long) posts.size(), text, new Date()));
    }
    public List<Post> listAllPosts(){
        return posts;
    }
}
