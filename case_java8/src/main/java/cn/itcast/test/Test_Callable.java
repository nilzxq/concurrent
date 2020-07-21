package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author nilzxq
 * @Date 2020-07-20 22:10
 */
@Slf4j(topic="c.Test_Callable")
public class Test_Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task=new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                log.debug("running");
                Thread.sleep(1000);
                return 100;
            }
        });
        Thread t=new Thread(task,"task");
        t.start();

        log.debug("{}",task.get());
    }


}
