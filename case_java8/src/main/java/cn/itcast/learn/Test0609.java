package cn.itcast.learn;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author nilzxq
 * @Date 2020-07-25 8:14
 */
public class Test0609 {
    public static void main(String[] args) {
        AtomicInteger i=new AtomicInteger(0);
        System.out.println(i.incrementAndGet());//++i 0,1
        System.out.println(i.getAndIncrement());//i-- 2,1

        System.out.println(i.getAndAdd(5));//2,7
        System.out.println(i.addAndGet(5));//12,12

        System.out.println(i.get());//12
    }
}
