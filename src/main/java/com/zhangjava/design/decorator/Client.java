package com.zhangjava.design.decorator;

/**
 * @author zhangxu
 * @date 2021/4/12 16:57
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        System.out.println("============= 使用装饰器 ===========");
        // 装饰
        Component decorator = new ConcreteDecorator(component);
        decorator.operation();
    }
}
