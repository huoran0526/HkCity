package com.example.demo.service;

import com.example.demo.entity.Demo;

/**
 * Created by huoran
 */
public interface DemoService {
    /**
     * 获取Demo
     * @return
     */
    Demo findByName(String name);
}