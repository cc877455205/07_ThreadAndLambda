package com.itheima.ThreadSync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: Lock锁
 * java.util.concurrent.locks.Lock 机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作,
 * 同步代码块/同步方法具有的功能Lock都有,除此之外更强大,更体现面向对象。
 * Lock锁也称同步锁，加锁与释放锁方法化了，如下：
 * public void lock() :加同步锁。
 * public void unlock() :释放同步锁。
 * @Date:Create：in 2021/1/14 17:53
 * @Author: czh
 */
public class ThreadLock implements Runnable {
    private int ticket = 100;
    Lock lock = new ReentrantLock();

    /*
     * 执行卖票操作
     */
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while (true) {
            lock.lock();
            if (ticket > 0) {//有票 可以卖
                //出票操作
                //使用sleep模拟一下出票时间
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖:" + ticket--);
            }
            lock.unlock();
        }
    }
}

