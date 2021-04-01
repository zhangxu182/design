package com.zhangjava.design.singleton;

/**
 * 懒汉式单例
 *
 * @author zhangxu
 * @date 2021/4/1 21:10
 */
public class Singleton2 {

    /**
     * 1.构造方法私有化，防止外部类使用new来创建对象
     */
    private Singleton2() {
        // 防止反射破坏单例
        if (instance != null) {
            throw new RuntimeException("禁止通过反射获取单例对象");
        }
    }

    /**
     * 2.创建实例
     */
    private static Singleton2 instance;

    /**
     * 3.静态方法获取实例对象
     *
     * @return
     */
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
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
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();

        System.out.println(s1 == s2);
    }
}
