package com.zhangjava.design.factory.simple;

import com.zhangjava.design.factory.Car;

/**
 * 简单工厂模式
 *
 * @author zhangxu
 * @date 2021/4/3 22:23
 */
public class SimpleFactory {
    /**
     * 获取汽车的工厂方法
     *
     * @param type
     * @return
     */
    public static Car getCar(String type) {
        Car car = null;
        switch (type) {
            case "AoDi":
                car = new AoDi();
                break;
            case "BaoMa":
                car = new BaoMa();
                break;
            case "BenChi":
                car = new BenChi();
                break;
            default:
        }

        return car;
    }

    public static void main(String[] args) {
        Car car1 = getCar("AoDi");
        Car car2 = getCar("BaoMa");
        Car car3 = getCar("BenChi");

        car1.info();
        car2.info();
        car3.info();
    }
}

class AoDi extends Car {

    @Override
    public void info() {
        System.out.println("奥迪汽车");
    }
}

class BaoMa extends Car {

    @Override
    public void info() {
        System.out.println("宝马汽车");
    }
}

class BenChi extends Car {

    @Override
    public void info() {
        System.out.println("奔驰汽车");
    }
}