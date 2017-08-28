package com.arahansa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by jarvis on 2017. 8. 29..
 */
@Slf4j
@Controller
public class DefaultController {

    @RequestMapping("/")
    @ResponseBody
    public String helloAdmin() {
        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        String roles = authorities.stream().map(Object::toString).collect(Collectors.joining(","));
        return "hello admin? : "+roles;
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){
        return "I'm admin";
    }
}
