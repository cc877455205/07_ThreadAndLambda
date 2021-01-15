package com.itheima.TestThread;

import java.util.concurrent.Executor;

/**
 * @Description:
 * @Date:Create：in 2020/12/29 18:06
 * @Author: czh
 */
public class TestRunnable implements Runnable{
    @Override
    public void run() {

        Executor executor = new Executor() {
            @Override
            public void execute(Runnable command) {

            }
        };
    }
}
