package com.study.redis.v1.service.impl;

import com.study.redis.v1.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {

    private final RedisTemplate redisTemplate;

    @Override
    public void selectUser() { }

    @Override
    public void createUser() { }

    @Override
    public void updateUser() { }

    @Override
    public void deleteUser() { }
}
