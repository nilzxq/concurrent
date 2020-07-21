package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @Author nilzxq
 * @Date 2020-07-21 7:37
 */
@Slf4j(topic = "c.Test44")
public class Test44 {
    public static void main(String[] args) throws InterruptedException {

        TimeUnit.SECONDS.sleep(1);
        Thread.sleep(1000);
    }
}
