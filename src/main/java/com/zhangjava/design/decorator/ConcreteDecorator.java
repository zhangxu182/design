package com.zhangjava.design.decorator;

/**
 * 具体装饰者类
 *
 * @author zhangxu
 * @date 2021/4/12 16:56
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }

}
