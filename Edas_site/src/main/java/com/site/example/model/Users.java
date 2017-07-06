package com.site.example.model;
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity  
@Table(name = "users")  
public class Users {  
    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)  
    private int id;  

    private String name; 

    private int gender; 
    
    public int getId() {  
        return id;  
    }  
  
    public void setGender(int gender) {  
        this.gender = gender;  
    }  
  
    public int getGender() {  
        return gender;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
}  