package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * User: ruochen
 * Date:2018/5/11 0011
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }
}
