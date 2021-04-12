package com.zhangjava.design.decorator;

/**
 * 被装饰者实现类
 *
 * @author zhangxu
 * @date 2021/4/12 16:51
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("被装饰者实现类");
    }
}
