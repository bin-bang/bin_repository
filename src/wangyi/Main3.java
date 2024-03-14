package wangyi;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Main3 {
    private  static volatile AtomicInteger number=new AtomicInteger(0);
    private static Semaphore semaphore=new Semaphore(1);
    public static void main(String[] args) throws InterruptedException {
        number.incrementAndGet();
        number.get();
        semaphore.acquire(2);
        semaphore.tryAcquire();
    }
}
