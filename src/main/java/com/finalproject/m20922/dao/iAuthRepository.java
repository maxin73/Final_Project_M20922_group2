package com.finalproject.m20922.dao;
import org.springframework.data.repository.CrudRepository;

import com.finalproject.m20922.entity.User;


public interface iAuthRepository extends CrudRepository<User, Long>{
    User findByEmailAndPassword(String email, String password); 
}
