package com.zhangjava.design.adapter.obj;

/**
 * 客户端使用
 *
 * @author zhangxu
 * @date 2021/4/8 22:11
 */
public class Client {
    public static void main(String[] args) {
        IVoltage5 voltage5 = new VoltageAdapter(new Voltage220());
        System.out.println(voltage5.out5v());
    }
}
