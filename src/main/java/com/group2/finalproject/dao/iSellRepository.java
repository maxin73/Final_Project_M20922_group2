package com.group2.finalproject.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.group2.finalproject.entity.Sell;

public interface iSellRepository extends CrudRepository <Sell, Long>{
  
  @Override
  public List<Sell> findAll();
}
