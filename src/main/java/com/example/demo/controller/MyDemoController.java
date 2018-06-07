package com.example.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Demo;
import com.example.demo.service.DemoService;

/**
 * Created by huoran
 */
@RestController
@RequestMapping(value = "/MyDemo.html")
public class MyDemoController {
	@Resource(name = "demoServiceImpl")
	private DemoService demoService; 
    
    @RequestMapping(value = "/GetDemo")
    public Demo getInfo(String name) {
        return demoService.findByName(name);
    }
}