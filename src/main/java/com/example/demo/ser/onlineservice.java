package com.example.demo.ser;

import com.example.demo.entity.onlineentity;
import com.example.demo.repo.onlinerepo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class onlineservice {
	@Autowired
	onlinerepo repo;
	
	public List<onlineentity> getall(){
		return repo.findAll();
		
	}
	public onlineentity getbyid(int aid){
		return repo.findById(aid).get();
	}
	
	public onlineentity additems(onlineentity entity) {
		repo.save(entity);
		return entity;
		
	}
	

}
