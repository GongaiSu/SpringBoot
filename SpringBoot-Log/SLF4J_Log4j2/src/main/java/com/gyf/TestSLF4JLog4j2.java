package com.gyf;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.slf4j.Log4jLoggerFactory;

@Slf4j
public class TestSLF4JLog4j2 {
    public static void main(String[] args) {
        log.info("信息");
        log.error("错误");
    }
}
