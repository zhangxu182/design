package com.zhangjava.design.factory.abs;


import com.zhangjava.design.factory.Car;

/**
 * 抽象工厂模式
 *
 * @author zhangxu
 * @date 2021/4/7 14:01
 */
public interface CarFactory {
    /**
     * 定义一个抽象方法，让各个子类自己实现
     *
     * @param type
     * @return
     */
    Car createCar(String type);


    public static void main(String[] args) {
        CarFactory carFactory = new AoDiCarFactory();
        Car car1 = carFactory.createCar("BeiJing");
        Car car2 = carFactory.createCar("ShangHai");
        Car car3 = carFactory.createCar("ShanXi");

        car1.info();
        car2.info();
        car3.info();
    }
}
