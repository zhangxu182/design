package com.zhangjava.design.builder;

/**
 * 客户端测试
 *
 * @author zhangxu
 * @date 2021/4/8 11:13
 */
public class Client {
    public static void main(String[] args) {
        // 建造普通房子
        HouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirector director = new HouseDirector(commonHouseBuilder);
        House commonHouse = director.buildHouse();
        System.out.println(commonHouse);

        System.out.println("=========================");

        // 建造高楼
        HighHouseBuilder highHouseBuilder = new HighHouseBuilder();
        director.setHouseBuilder(highHouseBuilder);
        House highHouse = director.buildHouse();
        System.out.println(highHouse);
    }
}
