package com.zhangjava.design.singleton;

/**
 * 枚举式单例
 *
 * @author zhangxu
 * @date 2021/4/3 21:41
 */
public enum Singleton5 {
    /**
     * 单例
     */
    INSTANCE;

    public void say() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Singleton5 s1 = Singleton5.INSTANCE;
        Singleton5 s2 = Singleton5.INSTANCE;
        System.out.println(s1 == s2);
        s1.say();
    }

}
