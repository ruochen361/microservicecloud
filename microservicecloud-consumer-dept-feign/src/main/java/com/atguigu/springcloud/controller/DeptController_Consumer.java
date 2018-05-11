package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * User: ruochen
 * Date:2018/5/9 0009
 */
@RestController
public class DeptController_Consumer {


    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return deptClientService.add(dept);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return deptClientService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
        return deptClientService.list();
    }



}
