package com.group2.finalproject.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group2.finalproject.entity.Search;

@Service
public class SearchService {
  @Autowired
  private iSearchRepository iHomeRepository;

  public Search findOne(String genre){

    //search one element
      Map<String, Object> map = iHomeRepository.findOne(genre);

    //get data from Map
      String itemName = (String)map.get("item_name");
      int price = (Integer)map.get("price");
      String itemDescription = (String)map.get("item_description");

    //set data in Search class
      Search search = new Search();
      search.setItemName(itemName);
      search.setPrice(price);
      search.setItemDescription(itemDescription);

    return search;

    
  }
}
