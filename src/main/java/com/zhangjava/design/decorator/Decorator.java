package com.zhangjava.design.decorator;

/**
 * 抽象装饰者
 *
 * @author zhangxu
 * @date 2021/4/12 16:52
 */
public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }

}
