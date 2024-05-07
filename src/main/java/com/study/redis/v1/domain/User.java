package com.study.redis.v1.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.time.LocalDateTime;

@Getter
@RedisHash(value = "user", timeToLive = 30)
public class User {

    @Id
    private String id;
    private String name;
    private int age;
    private LocalDateTime createdAt;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.createdAt = LocalDateTime.now();
    }
}
