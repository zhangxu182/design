package com.zhangjava.design.singleton;

import java.io.Serializable;

/**
 * 双重检查锁单例
 *
 * @author zhangxu
 * @date 2021/4/1 21:10
 */
public class Singleton3 implements Serializable {

    private static final long serialVersionUID = -8729212868336593368L;

    /**
     * 1.构造方法私有化，防止外部类使用new来创建对象
     */
    private Singleton3() {
        // 防止反射破坏单例
        if (instance != null) {
            throw new RuntimeException("禁止通过反射获取单例对象");
        }
    }

    /**
     * 2.创建实例
     */
    private static volatile Singleton3 instance;

    /**
     * 3.静态方法获取实例对象
     *
     * @return
     */
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }

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
        Singleton3 s1 = Singleton3.getInstance();
        Singleton3 s2 = Singleton3.getInstance();

        System.out.println(s1 == s2);
    }
}
