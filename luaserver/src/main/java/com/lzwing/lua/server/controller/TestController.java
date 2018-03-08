package com.lzwing.lua.server.controller;

import com.lzwing.service.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: chenzhongyong@cecdat.com
 * Date: 2018/3/8
 * Time: 15:38
 */
@RestController
@Slf4j
public class TestController {

    @Autowired
    ClientService clientService;

    @GetMapping("/test")
    public boolean getInfo(@RequestParam String phone) {
        log.info("phone:{}",phone);
        return clientService.acquireToken(phone);
    }

}
