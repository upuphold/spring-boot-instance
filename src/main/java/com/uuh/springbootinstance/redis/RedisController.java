package com.uuh.springbootinstance.redis;

import com.uuh.springbootinstance.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cg
 * @description redis实战
 * @date 2019/12/26 10:44
 * @since 1.0
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtil redisUtil;



    @GetMapping("/testRedis")
    public void testRedis(){

        String count = redisUtil.get("count");
        redisUtil.set("count","3");

    }


}