package com.example.demo.user;
import com.example.demo.location.Location;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class UserService {
    User user1= new User(
            "u1","Jeny","Otieno", new Location("l1","Nairobi"),"derrickotieno41@gmail.com"
    );
    User user2= new User(
            "u2","Derrick","Owino", new Location("l1","Mombasa"),"derrickkamire@yahoo.com"
    );
    User user3= new User(
            "u3","Collins","Kamire", new Location("l1","Kisumu"),"d.omondi@carepay.com"
    );

    List<User> users=new ArrayList<>( Arrays.asList(user1,user2,user3));

    public List<User> getAllUser(){
        return users;

    }
    public User getUser(String id){
        User user=users.stream().filter(t -> id.equals(t.getId())).findFirst().orElse(null);
        return user;
    }
    public void addUser(User user){
        users.add(user);
    }
    public void editUser(String id,User newuser){

        users.stream().filter(t -> id.equals(t.getId())).findFirst().map(k -> {k.setId(newuser.getId());
                                 k.setEmail(newuser.getEmail());
        k.setFirst_name(newuser.getFirst_name());
        k.setSecond_name(newuser.getSecond_name());
        k.setLocation(newuser.getLocation());
            return null;
        });
    }
    public void removeUser(String id){
        User user=users.stream().filter(t -> id.equals(t.getId())).findFirst().orElse(null);
        users.remove(user);

    }


}
