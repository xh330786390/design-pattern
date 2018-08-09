package com.tengxh.facade;

/**
 * @ClassName: Memery.java
 * @Description: java类作用描述
 * @Author: tengxh
 * @CreateDate: 2018/8/9
 * @Version: 1.0
 */
public class Memery implements Service {
    /**
     * 启动
     *
     * @return void
     * @author tengxh
     * @date 2018/8/9 13:29
     */
    @Override
    public void start() {
        System.out.println("Memery start");
    }

    /**
     * 停止
     *
     * @return void
     * @author tengxh
     * @date 2018/8/9 13:29
     */
    @Override
    public void stop() {
        System.out.println("Memery stop");
    }
}
