package com.gyf;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SLF4J_Logback1 {

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            log.info("信息");
            log.error("错误");
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("111----------");
        }

    }
}
