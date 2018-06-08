package com.example.base.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import com.example.base.dao.BaseRepository;
import com.example.base.service.BaseService;

/**
 * BaseServiceImpl - 基类
 * 
 * @author huoran
 * @version 1.0
 */
public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

	@Autowired
	BaseRepository<T, Serializable> baseRepository;

	@Override
	public T save(T t) {
		return baseRepository.save(t);
	}

	@Override
	public T update(T t) {
		return baseRepository.saveAndFlush(t);
	}

	@Override
	public T find(ID id) {
		return baseRepository.getOne(id);
	}

	@Override
	public void delete(ID id) {
		baseRepository.deleteById(id);
	}

	@Override
	public void delete(T t) {
		baseRepository.delete(t);
	}

	@Override
	public boolean exists(ID id) {
		return baseRepository.existsById(id);
	}

	@Override
	public long count() {
		return baseRepository.count();
	}

	@Override
	public List<T> findAll() {
		return baseRepository.findAll();
	}

	@Override
	public List<T> findAll(Sort sort) {
		return baseRepository.findAll(sort);
	}

	@Override
	public List<T> findAll(Specification<T> specification) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<T> findPage(Pageable pageable) {
		return baseRepository.findAll(pageable);
	}

	// @Override
	// public Page<T> findAll(Specification<T> specification, Pageable pageable) {
	// // TODO Auto-generated method stub
	// return null;
	// }
}