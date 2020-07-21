package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author nilzxq
 * @Date 2020-07-20 21:09
 */
@Slf4j(topic = "c.test_thread_2")
public class test_thread_2 {
    public static void main(String[] args) {
        //匿名内部类实现run
        Runnable r= () -> log.debug("running");
        Thread t=new Thread(r,"t2");
        t.start();
        log.debug("running");
    }
}
