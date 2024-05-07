package com.study.redis.v1.repository;

import com.study.redis.v1.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface RedisUserRepository extends CrudRepository<User, String> {
}
