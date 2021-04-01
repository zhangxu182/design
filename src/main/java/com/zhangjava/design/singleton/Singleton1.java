package com.zhangjava.design.singleton;

import java.io.Serializable;

/**
 * 恶汉式单例
 *
 * @author zhangxu
 * @date 2021/4/1 21:10
 */
public class Singleton1 implements Serializable {

    private static final long serialVersionUID = 4573739032130056048L;

    /**
     * 1.构造方法私有化，防止外部类使用new来创建对象
     */
    private Singleton1() {
        // 防止反射破坏单例
        if (instance != null) {
            throw new RuntimeException("禁止通过反射获取单例对象");
        }
    }

    /**
     * 2.创建实例
     */
    private static Singleton1 instance = new Singleton1();

    /**
     * 3.静态方法获取实例对象
     *
     * @return
     */
    public static Singleton1 getInstance() {
        return instance;
    }

    /**
     * 防止反序列化时生成新对象
     *
     * @return
     */
    private Object readResolve() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        System.out.println(s1 == s2);
    }
}
