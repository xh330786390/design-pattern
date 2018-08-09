package com.tengxh.facotry;

/**
 * @ClassName: ClientApp.java
 * @Description: java类作用描述
 * @Author: tengxh
 * @CreateDate: 2018/8/3
 * @Version: 1.0
 */
public class ClientApp {

    public static void main(String[] args) {
        BaseA baseA = new BaseA();
        baseA.setMsg("成功");
        baseA.setSuccess(true);

        Children children = new Children();
        children.setNew1("new1");
        children.setNew2("new2");
        BaseA baseA1 = children;

        baseA.setMsg("成功");
        baseA.setSuccess(true);
    }
}
