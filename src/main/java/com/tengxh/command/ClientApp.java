package com.tengxh.command;

public class ClientApp {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.setCommand(new ConcreteCommand1());
        invoker.action();

        invoker.setCommand(new ConcreteCommand2());
        invoker.action();
    }
}
