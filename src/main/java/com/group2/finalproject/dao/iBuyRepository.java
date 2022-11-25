package com.group2.finalproject.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.group2.finalproject.entity.Buy;



public interface iBuyRepository extends CrudRepository<Buy, Long> {
    
    @Override
    public List<Buy> findAll();

}
