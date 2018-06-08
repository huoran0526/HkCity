package com.example.base.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

/**
 * BaseService - 基类
 * 
 * @author huoran
 * @version 1.0
 */
public interface BaseService<T, ID extends Serializable> {

	T save(T t);

	T update(T t);

	T find(ID id);

	void delete(ID id);

	void delete(T t);

	boolean exists(ID id);

	long count();

	List<T> findAll();

	List<T> findAll(Sort sort);

	List<T> findAll(Specification<T> specification);

	Page<T> findPage(Pageable pageable);

	// Page<T> findPage(Specification<T> specification, Pageable pageable);

}