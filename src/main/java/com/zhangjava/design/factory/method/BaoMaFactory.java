package com.zhangjava.design.factory.method;

import com.zhangjava.design.factory.Car;

/**
 * 宝马汽车工厂类
 *
 * @author zhangxu
 * @date 2021/4/7 14:14
 */
public class BaoMaFactory implements CarFactory {
    @Override
    public Car createCar(String type) {
        Car car = null;
        switch (type) {
            case "BeiJing":
                car = new BeiJingBaoMa();
                break;
            case "ShangHai":
                car = new ShangHaiBaoMa();
                break;
            case "ShanXi":
                car = new ShanXiBaoMa();
                break;
            default:
        }

        return car;
    }
}


class BeiJingBaoMa extends Car {
    @Override
    public void info() {
        System.out.println("北京宝马汽车");
    }
}

class ShangHaiBaoMa extends Car {
    @Override
    public void info() {
        System.out.println("上海宝马汽车");
    }
}

class ShanXiBaoMa extends Car {
    @Override
    public void info() {
        System.out.println("上海宝马汽车");
    }
}