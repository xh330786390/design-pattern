package com.tengxh.decorator;

/**
 * @ClassName: Decorator.java
 * @Description: java类作用描述
 * @Author: tengxh
 * @CreateDate: 2018/8/9
 * @Version: 1.0
 */
public abstract class Decorator extends Component {

    private Component mComponent;

    public Decorator(Component component) {
        mComponent = component;
    }

    @Override
    public void operate() {
        //委托给被修饰者去执行对应的方法
        this.mComponent.operate();
    }
}