package practice;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolTrader implements Executor {

    private final AtomicInteger ctl =new AtomicInteger(0);

    private volatile int corePoolSize;
    private volatile int maxPoolSize;

    private final BlockingQueue<Runnable> workQueue;

    public ThreadPoolTrader(int corePoolSize,int maxPoolSize,BlockingQueue<Runnable> workQueue){
        this.corePoolSize=corePoolSize;
        this.maxPoolSize=maxPoolSize;
        this.workQueue=workQueue;
    }

    @Override
    public void execute(Runnable command) {
        int c=ctl.get();
        if(c<corePoolSize){
            if(!addWorker(command)){
                reject();
            }
            return;
        }
        if (!workQueue.offer(command)){
            if (!addWorker(command)){
                reject();
            }
        }
    }

    private void reject() {
        throw new RuntimeException("Error !");
    }

    private boolean addWorker(Runnable firstTask) {
        if(ctl.get()>=maxPoolSize) return false;

        Worker  worker=new Worker(firstTask);
        worker.thread.start();
        ctl.incrementAndGet();
        return true;
    }

    private final class Worker implements Runnable{

        final Thread thread;
        Runnable firstTask;

        public Worker(Runnable firstTask){
            this.thread=new Thread(this);
            this.firstTask=firstTask;
        }

        @Override
        public void run() {
            Runnable task=firstTask;
            try {
                while (task!=null || (task=getTask())!=null){
                    task.run();
                    if (ctl.get()>maxPoolSize){
                        break;
                    }
                    task=null;
                }
            }finally {
                ctl.decrementAndGet();
            }
        }

        private Runnable getTask() {
            for (;;){
                try {
                    System.out.println("WorkQueue.size:"+workQueue.size());
                    return workQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


