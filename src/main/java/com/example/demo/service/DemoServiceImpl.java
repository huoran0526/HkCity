package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DemoDao;
import com.example.demo.entity.Demo;

/**
 * Created by huoran
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    DemoDao demoDao;
    /**
     *
     * @return
     */
    @Override
    @Transactional
    public Demo findByName(String name) {
        return demoDao.findByName(name);
    }
}