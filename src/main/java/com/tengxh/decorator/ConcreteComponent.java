package com.tengxh.decorator;

/**
 * @ClassName: ConcreteComponent.java
 * @Description: java类作用描述
 * @Author: tengxh
 * @CreateDate: 2018/8/9
 * @Version: 1.0
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("operate");
    }
}