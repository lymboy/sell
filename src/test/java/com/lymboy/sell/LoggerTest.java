package com.lymboy.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    private final Logger logger = LoggerFactory.getLogger("com.lymboy.sell.LoggerTest");

    @Test
    public void test00() {
        logger.debug("debug..........");
        logger.info("info..........");
        logger.error("err..........");
    }

//    @Test
//    public void test01() {
//        log.info("sdsdsf");
//        log.err("errgergrtgr.......");
//    }
}
