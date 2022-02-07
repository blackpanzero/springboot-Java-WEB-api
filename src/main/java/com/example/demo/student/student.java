package com.example.demo.student;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
    @Id
    private  String id;
    private String name;
    private String depertment;

    public student(String id, String name, String depertment) {
        this.id = id;
        this.name = name;
        this.depertment = depertment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepertment() {
        return depertment;
    }

    public void setDepertment(String depertment) {
        this.depertment = depertment;
    }
}
