package com.zhangjava.design.singleton;

import java.io.Serializable;

/**
 * 静态内部类式单例
 *
 * @author zhangxu
 * @date 2021/4/1 21:10
 */
public class Singleton4 implements Serializable {

    private static final long serialVersionUID = -7778834422082239246L;

    /**
     * 构造方法私有化，防止外部类使用new来创建对象
     */
    private Singleton4() {
        // 防止反射破坏单例
        if (SingletonInstance.INSTANCE != null) {
            throw new RuntimeException("禁止反射获取单例对象");
        }
    }

    /**
     * 创建静态内部类
     */
    private static class SingletonInstance {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    /**
     * 提供获取单例对象的方法，供外部使用
     *
     * @return
     */
    public static Singleton4 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    /**
     * 防止反序列化时生成新对象
     *
     * @return
     */
    private Object readResolve() {
        return SingletonInstance.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();
        System.out.println(s1 == s2);
    }
}
