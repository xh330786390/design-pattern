package com.tengxh.facade;

/**
 * @ClassName: Facade.java
 * @Description: java类作用描述
 * @Author: tengxh
 * @CreateDate: 2018/8/9
 * @Version: 1.0
 */
public class Facade implements Service {
    Service cpu;
    Service memery;

    public Facade() {
        cpu = new CPU();
        memery = new Memery();
    }

    /**
     * 启动
     *
     * @return void
     * @author tengxh
     * @date 2018/8/9 13:29
     */
    @Override
    public void start() {
        cpu.start();
        memery.start();
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
        cpu.stop();
        memery.stop();
    }
}
