package com.site.example.model;
import java.util.List;

import com.site.example.model.Users;  

import org.springframework.data.repository.CrudRepository;  
  

//CRUD refers Create, Read, Update, Delete
public interface UsersDao extends CrudRepository<Users, Integer> {

	List<Users> findById(int id);  
        
}  