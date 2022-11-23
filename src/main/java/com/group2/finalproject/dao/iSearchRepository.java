package com.group2.finalproject.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class iSearchRepository {
    @Autowired
    private JdbcTemplate searchFunction;

    public Map<String, Object> findOne(String genre){
      
      //SELECT
      String query = "SELECT "
              + " item_name,"
              + " price,"
              + " item_description "
              + "FROM sell "
              + "WHERE genre=?";
      
              Map<String, Object> search = searchFunction.queryForMap(query, genre);

              return search;
    }
  } 
