package com.itheima.ThreadPoolLearn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description:
 * @Date:Create：in 2020/12/8 15:14
 * @Author: czh
 */
public class ThreadPoolExecutor01 implements Runnable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new ThreadPoolExecutor01());
        executorService.execute(new ThreadPoolExecutor01());
    }

    @Override
    public void run() {
        System.out.println("bayern cc");
    }
}
