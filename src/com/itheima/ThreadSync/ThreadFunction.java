package com.itheima.ThreadSync;

/**
 * @Description: 同步方法
 * @Date:Create：in 2021/1/14 17:51
 * @Author: czh
 */
public class ThreadFunction implements Runnable {
    private int ticket = 100;

    /*
     * 执行卖票操作
     */
    @Override
    public void run() {
        //每个窗口卖票的操作
        //窗口 永远开启
        while (true) {
            sellTicket();
        }
    }

    /* *
     * 锁对象 是 谁调用这个方法 就是谁
     * 隐含 锁对象 就是 this
     * */
    public synchronized void sellTicket() {
        if (ticket > 0) {//有票 可以卖
            //出票操作
            //使用sleep模拟一下出票时间
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //获取当前线程对象的名字
            String name = Thread.currentThread().getName();
            System.out.println(name + "正在卖:" + ticket--);
        }
    }

}

