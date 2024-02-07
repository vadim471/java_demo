package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private ArrayList<Post> posts;

    public PostService(){
        posts = new ArrayList<>();
        posts.add(new Post("post1", new Date(2000, Calendar.JUNE, 2)));
        posts.add(new Post("post2", new Date(2001)));
        posts.add(new Post("post3", new Date(2002)));

    }
    public ArrayList<Post> listAllPosts(){
        return posts;
    }
}
