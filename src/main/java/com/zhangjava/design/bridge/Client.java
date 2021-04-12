package com.zhangjava.design.bridge;

/**
 * @author zhangxu
 * @date 2021/4/12 14:08
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new SmartPhone(new MiPhone());
        System.out.println(phone.open());
        System.out.println(phone.close());
        System.out.println(phone.call());
    }
}
