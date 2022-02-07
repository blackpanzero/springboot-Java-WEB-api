package com.example.demo.post;

import com.example.demo.location.Location;
import com.example.demo.user.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
public class PostService {
    Post post1 = new Post("1P","12/03/1994",new User("12E","Deno","Owino",new Location("Ki","Kitengela"),"owino@example.com"), "this is my post");
    Post post2 = new Post("2P","12/03/1995",new User("12E","Dero","Owino",new Location("Ki","Kitengela"),"owino@example.com"), "this is my post");
    Post post3 = new Post("3P","12/03/1996",new User("12E","Brayo","Owino",new Location("Ki","Kitengela"),"owino@example.com"), "this is my post");
    List<Post> posts=new ArrayList<>( Arrays.asList(post1,post2,post3));
    @RequestMapping("/posts")
    public List<Post> getAllPosts(){
        return posts;

    }
    public Post getPost(String id){
        Post post = posts.stream().filter(k -> id.equals(k.getId())).findFirst().orElse(null);
        return post;

    }
    public void addPost(Post post){
        posts.add(post);

    }
    public void editPost(String id,Post newPost){
        posts.stream().filter(k -> id.equals(k.getId())).findFirst().map(t -> {
            t.setId(newPost.getId());
            t.setDetails(newPost.getDetails());
            t.setPostdate(newPost.getPostdate());
            t.setUser(newPost.getUser());

            return null;
        });


    }

    public void deletePost(String id) {
        Post post = posts.stream().filter(k -> id.equals(k.getId())).findFirst().orElse(null);
        posts.remove(post);
    }
}
