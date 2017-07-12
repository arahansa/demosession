package com.arahansa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemosessionApplicationTests {

	private static final String JINQ = "jinq";
	private static final String ELASTIC = "elastic";
	private static final String REDIS = "redis";
	private static final String JPA = "jpa";
	private static final String LECTURE = "lecture";
	private static final String SPRING_DATA = "spring:data";
	private static final String PRESENTERS = "presenters";
	private static final String VALUE_ARAHANSA = "arahansa";
	private static final String KEY_STRING = "redis:test:string";

	@Autowired
	private StringRedisTemplate template;


	@Test
	public void contextLoads() {
		ValueOperations<String, String> ops = this.template.opsForValue();
		ops.set(KEY_STRING, VALUE_ARAHANSA);
		System.out.println("발견된 키 " + KEY_STRING + ", 값=" + ops.get(KEY_STRING));
		assertEquals(ops.get(KEY_STRING), VALUE_ARAHANSA);



	}

}
