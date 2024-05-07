package com.study.redis.v1;

import com.study.redis.v1.domain.User;
import com.study.redis.v1.repository.RedisUserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class RedisUserRepoTest {

    @Autowired
    RedisUserRepository redisUserRepository;

    @Test
    @DisplayName("사용자 추가")
    void testCreate() {

        // given
        User user = new User("heedong", 34);

        // when
        redisUserRepository.save(user);
        User findUser = redisUserRepository.findById("heedong").orElse(null);

        // then
        assertThat(findUser).isNotNull();
        assertThat(findUser.getName()).isEqualTo(user.getName());
        assertThat(findUser.getAge()).isEqualTo(user.getAge());
    }

    @Test
    @DisplayName("사용자 전체 조회")
    void testFindAll() {

        // when
        redisUserRepository.findAll().iterator()
                .forEachRemaining(user -> System.out.println(user));
    }

    @Test
    @DisplayName("사용자 조회")
    void testFindUser() {

        // given
        String id = "";

        // when
        User findUser = redisUserRepository.findById(id).orElse(null);

        // then
        assertThat(findUser).isNotNull();
    }
}
