package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author nilzxq
 * @Date 2020-07-20 20:56
 */
@Slf4j(topic="c.Test")
public class test {
    public static void main(String[] args) {
        Thread t=new Thread(){
            public void run(){
                log.debug("running");
            }
        };
        t.setName("t1");
        t.start();
        log.debug("running");
    }
}
