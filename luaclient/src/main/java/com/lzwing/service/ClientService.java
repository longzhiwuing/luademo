package com.lzwing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: chenzhongyong@cecdat.com
 * Date: 2018/3/8
 * Time: 15:17
 */
@Service
public class ClientService {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisScript<Long> rateLimitLua;

    public boolean acquireToken(String key) {
        Long rs = stringRedisTemplate.execute(rateLimitLua, Collections.singletonList(key), "60", "10");

        return rs.intValue()==1;
    }
}
