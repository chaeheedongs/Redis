package com.study.redis.v1.service.impl;

import com.study.redis.v1.domain.User;
import com.study.redis.v1.repository.RedisUserRepository;
import com.study.redis.v1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final RedisUserRepository userRepository;

    @Override
    public void selectUser() { }

    @Override
    public void createUser() { }

    @Override
    public void updateUser() { }

    @Override
    public void deleteUser() { }
}
