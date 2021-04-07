package com.zhangjava.design.factory.method;

import com.zhangjava.design.factory.Car;

/**
 * 奥迪汽车工厂类
 *
 * @author zhangxu
 * @date 2021/4/7 14:05
 */
public class AoDiCarFactory extends CarFactory {

    @Override
    Car createCar(String type) {
        Car car = null;
        switch (type) {
            case "BeiJing":
                car = new BeiJingAoDi();
                break;
            case "ShangHai":
                car = new ShangHaiAoDi();
                break;
            case "ShanXi":
                car = new ShanXiAoDi();
                break;
            default:
        }

        return car;
    }

}

class BeiJingAoDi extends Car {
    @Override
    public void info() {
        System.out.println("北京奥迪");
    }
}

class ShangHaiAoDi extends Car {
    @Override
    public void info() {
        System.out.println("上海奥迪");
    }
}

class ShanXiAoDi extends Car {
    @Override
    public void info() {
        System.out.println("山西奥迪");
    }
}