package com.arahansa.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by lucas.choi on 2017. 7. 12..
 */

@RestController
public class SessionController {

    @RequestMapping("/")
    public String helloAdmin() {
        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        String roles = authorities.stream().map(Object::toString).collect(Collectors.joining(","));
        return "hello admin : "+roles;
    }

}
