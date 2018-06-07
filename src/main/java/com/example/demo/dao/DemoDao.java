package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Demo;

/**
 * Created by huoran
 */
public interface DemoDao extends JpaRepository<Demo, Integer> {	
	/**
     * 获取一个同学的信息
     * @return
     */	
	Demo findByName(String name);
}