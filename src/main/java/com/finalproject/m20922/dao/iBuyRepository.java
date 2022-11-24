
package com.finalproject.m20922.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.finalproject.m20922.entity.Buy;




public interface iBuyRepository extends CrudRepository<Buy, Long> {
    
    @Override
    public List<Buy> findAll();

}
