package com.example.demo.post;

import com.example.demo.location.Location;
import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;
    @RequestMapping("/posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }
    @RequestMapping("/posts/{id}")
    public Post getPost(@PathVariable String id){
        return postService.getPost(id);

    }
    @PostMapping("/posts")
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }
    @PutMapping("/posts/{id}")
    public void editPost(@PathVariable String id, @RequestBody Post post){
        postService.editPost(id,post);

    }
    @DeleteMapping("/posts/{id}")
    public void deletePost(@PathVariable String id){
        postService.deletePost(id);

    }

}
