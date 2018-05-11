package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: ruochen
 * Date:2018/5/10 0010
 */
@Configuration
public class MySelfRule {


    @Bean
    public IRule myRule(){

        return new RandomRule_LRC();
    }
}
