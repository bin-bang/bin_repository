package practice;

import java.util.concurrent.*;

public class Exec {
    private static BlockingQueue<Runnable> queue=new ArrayBlockingQueue<>(50);
    private static RejectedExecutionHandler handler=new ThreadPoolExecutor.CallerRunsPolicy();
    public static void main(String[] args) {
        //ThreadPoolTrader threadPoolTrader=new ThreadPoolTrader(5,5,new ArrayBlockingQueue<>(10));
        Object o=new Object();
        ThreadPoolExecutor threadPoolTrader=new ThreadPoolExecutor(10,10,1, TimeUnit.SECONDS,queue,handler);
        for (int i=0;i<20;i++){
            int finalI = i;
            threadPoolTrader.execute(() -> {
                synchronized (o){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"任务编号："+ finalI);
            });
        }
    }
}
