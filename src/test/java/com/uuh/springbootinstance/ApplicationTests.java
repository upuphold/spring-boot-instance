package com.uuh.springbootinstance;

import com.uuh.springbootinstance.mybatis.TBImpDateCon;
import com.uuh.springbootinstance.mybatis.TBImpDateConMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author cg
 * @description
 * @date 2019/12/20 17:34
 * @since 1.0
 */
@SpringBootTest
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationTests {

    @Autowired
    private TBImpDateConMapper tbImpDateConMapper;

    @Test
    @Rollback
    public void findByName() throws Exception {
        TBImpDateCon all = tbImpDateConMapper.findAll();
        log.info(String.valueOf(all));
    }

}