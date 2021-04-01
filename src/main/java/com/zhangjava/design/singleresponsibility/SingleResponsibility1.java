package com.zhangjava.design.singleresponsibility;

/**
 * 单一职责原则演示
 *
 * @author zhangxu
 * @date 2021/3/25 22:02
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Transportation transportation = new Transportation();
        transportation.run("汽车");
        transportation.run("摩托");
        transportation.run("轮船");
        transportation.run("飞机");
    }
}

class Transportation {
    public void run(String type) {
        System.out.println(type + " 在公路上运行……");
    }
}
