package com.itheima.TestThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Description:
 * @Date:Create：in 2020/12/29 16:56
 * @Author: czh
 */
public class TestCallable {
    public static void main(String[] args) {
        Callable callable = new MyCallable();
        for (int i = 0; i < 10; i++) {
            FutureTask task = new FutureTask(callable);
            new Thread(task, "子线程" + i).start();
            try {
                //获取子线程的返回值
                System.out.println("子线程返回值：" + task.get() + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
