package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {
    final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public void create(String text) {
        this.postRepository.save(new Post(null, text, new Date()));
    }
    public List<Post> listAllPosts(){
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }
}
