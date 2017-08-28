
package com.arahansa.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
/*import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.ConfigureRedisAction;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;*/

import javax.annotation.PostConstruct;

@Slf4j
// @Configuration
// @EnableRedisHttpSession
public class SessionConfig { //extends AbstractHttpSessionApplicationInitializer {

    /*@Autowired
    Environment env;

    @PostConstruct
    public void setup(){
        log.info("redis host server : {}", env.getProperty("spring.redis.host"));
    }

    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private int port;

    @Bean
    public static ConfigureRedisAction configureRedisAction() {
        return ConfigureRedisAction.NO_OP;
    }

    @Bean
    public JedisConnectionFactory connectionFactory() {
        JedisConnectionFactory jf = new JedisConnectionFactory();
        jf.setHostName(host);
        jf.setPort(6379);
        jf.setTimeout(2000);
        return jf;
    }*/
}