package com.itheima.ThreadPoolLearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @Description:
 * @Date:Create：in 2020/12/8 13:31
 * @Author: czh
 */
public class ThreadPoolTest {
    public static void main(String[] args) throws Exception {
        Long start = System.currentTimeMillis();
        final Random random = new Random();
        final List<Integer> list = new ArrayList<Integer>();
        //newSingleThreadExecutor单线程式的线程池
        //如果线程遇到错误中止，它是无法使用替代线程的。
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10000; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    list.add(random.nextInt());
                }
            });
            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.DAYS);
            System.out.println("时间:" + (System.currentTimeMillis() - start));
            System.out.println("size:" + list.size());

        }
        //newFixedThreadPool创建固定大小的线程池，核心线程数和最大线程数=10
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        OutService outService = new OutService();
        //异步调用服务
        Future<Long> userServicesFuture = executorService1.submit(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return outService.outService();
            }
        });

        Thread thread = new Thread();
    }
}
