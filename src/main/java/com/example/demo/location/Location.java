package com.example.demo.location;

public class Location {
    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String id, String name){
        this.id=id;
        this.name=name;
    }

    public Location(String id, String name) {
        this.id=id;
        this.name=name;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }


}
