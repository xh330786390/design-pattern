package com.tengxh.adapter;

public class ClientApp {
    public static void main(String[] args) {
        Target t1 = new ConcreteTarget();
        t1.volt5();

        Target t2 = new Adapter();
        t2.volt5();
    }
}
