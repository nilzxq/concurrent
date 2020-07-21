package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @Author nilzxq
 * @Date 2020-07-21 9:20
 */
@Slf4j(topic = "c.Test45")
public class Test45 {
    public static void main(String[] args) throws InterruptedException {

        TwoPhaseTermination2 twoPhaseTermination2=new TwoPhaseTermination2();
        twoPhaseTermination2.start();
        Thread.sleep(2000);
        twoPhaseTermination2.stop();
    }
}

@Slf4j(topic = "c.TwoPhaseTermination2")
class TwoPhaseTermination2{
    private Thread monitor;
    //启动线程
    public void start(){
        monitor=new Thread(()->{
            while(true){
                Thread current= Thread.currentThread();
                if(current.isInterrupted()){
                    log.debug("料理后事");
                    break;
                }
                try {
                    Thread.sleep(2000);//情况1
                    log.debug("执行监控记录");//情况2

                } catch (InterruptedException e) {
                    e.printStackTrace();
                    //重新设置打断标记
                    current.interrupt();
                }
            }
        });
        monitor.start();
    }

    public void stop() {
        monitor.interrupt();
    }
}
