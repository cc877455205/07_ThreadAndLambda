package com.itheima.TestThread;

import java.util.concurrent.Callable;

/**
 * @Description:
 * @Date:Create：in 2020/12/29 16:55
 * @Author: czh
 */
public class MyCallable implements Callable {

    int i = 0;

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "  i的值：" + i);
        return i++; //call方法可以有返回值
    }
}
