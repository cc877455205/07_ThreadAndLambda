package com.itheima.ThreadSync;

/**
 * @Description: 同步代码块
 * @Date:Create：in 2021/1/14 17:49
 * @Author: czh
 */
public class ThreadBlock implements Runnable {
    private int ticket = 100;
    Object lock = new Object();

    /*
     * 执行卖票操作
     */
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while (true) {
            synchronized (lock) {
                if (ticket > 0) {//有票 可以卖
                    //出票操作
                    try {
                        //使用sleep模拟一下出票时间
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //获取当前线程对象的名字
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖:" + ticket--);
                }
            }
        }
    }
}

