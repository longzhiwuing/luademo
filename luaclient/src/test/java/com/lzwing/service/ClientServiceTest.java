package com.lzwing.service;

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
 * Time: 16:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ClientServiceTest extends TestCase {

    @Autowired
    ClientService clientService;

    @Test
    public void testAcquireToken() {
        for(int i=0;i<16;i++){
            boolean b = clientService.acquireToken("123456");
            log.info("b:{}",b);
        }
    }
}