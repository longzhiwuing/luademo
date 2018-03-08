package com.lzwing.dao;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: chenzhongyong@cecdat.com
 * Date: 2018/3/8
 * Time: 14:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RedisDaoTest extends TestCase {

    @Autowired
    RedisDao redisDao;

    @Test
    public void testGetValue() {
        redisDao.setKey("bbb", "eee");
        redisDao.setKey("aaa", "ccc");
        /*String bbb = redisDao.getValue("bbb");
        log.info("bbb:{}",bbb);*/
    }
}