package com.itheima.ThreadSync;


/**
 * @Description:
 * @Date:Create：in 2021/1/14 17:57
 * @Author: czh
 */
public class TestMain {
    public static void main(String[] args) {

        ThreadBlock threadBlock = new ThreadBlock();
        long start = System.currentTimeMillis();
        threadBlock.run();
//        ThreadFunction tf = new ThreadFunction();
//        long start = System.currentTimeMillis();
//        tf.run();
//        System.out.println("时间:" + (System.currentTimeMillis() - start));

//        ThreadLock tl = new ThreadLock();
//        tl.run();
    }
}
