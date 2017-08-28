package com.arahansa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * Created by lucas.choi on 2017. 7. 12..
 */

@Slf4j
@RestController
public class SessionController {

    @Autowired
    private StringRedisTemplate template;

    ValueOperations<String, String> ops;

    @PostConstruct
    public void setup(){
        ops = this.template.opsForValue();
    }

    @GetMapping("/set")
    public String setValue(String key, String value){
        ops.set(key, value);
        return "OK";
    }

    @GetMapping("/get")
    public String getValue(String key){
        String s = ops.get(key);
        return s != null ? s : "NULL";
    }

}
