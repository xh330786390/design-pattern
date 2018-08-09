package com.tengxh.decorator;

/**
 * @ClassName: ClientApp.java
 * @Description: java类作用描述
 * @Author: tengxh
 * @CreateDate: 2018/8/9
 * @Version: 1.0
 */
public class ClientApp {
    public static void main(String[] args) {
        Component component = new ConcreteDecorator1(new ConcreteDecorator2(new ConcreteComponent()));
        component.operate();
    }
}
