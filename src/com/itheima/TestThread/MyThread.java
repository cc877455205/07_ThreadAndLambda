package com.itheima.TestThread;

/**
 * @Description:
 * @Date:Create：in 2020/12/29 11:19
 * @Author: czh
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("执行子线程...");
    }
}
