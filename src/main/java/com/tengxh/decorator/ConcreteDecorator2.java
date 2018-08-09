package com.tengxh.decorator;

/**
 * @ClassName: ConcreteDecorator2.java
 * @Description: java类作用描述
 * @Author: tengxh
 * @CreateDate: 2018/8/9
 * @Version: 1.0
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        decorate2();
        super.operate();
    }

    public void decorate2() {
        System.out.println("修饰方法2");
    }
}