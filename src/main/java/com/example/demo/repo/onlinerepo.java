package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.onlineentity;

public interface onlinerepo extends JpaRepository<onlineentity, Integer> {

}
