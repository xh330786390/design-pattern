package com.tengxh.decorator;

/**
 * @ClassName: ConcreteDecorator1.java
 * @Description: java类作用描述
 * @Author: tengxh
 * @CreateDate: 2018/8/9
 * @Version: 1.0
 */
public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        decorate1();
        super.operate();
    }

    public void decorate1() {
        System.out.println("修饰方法1");
    }
}
