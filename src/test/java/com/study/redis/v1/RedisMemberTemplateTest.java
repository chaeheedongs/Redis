package com.study.redis.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisMemberTemplateTest {

    @Autowired
    RedisTemplate redisTemplate;
}
