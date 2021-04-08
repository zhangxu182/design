package com.zhangjava.design.builder;

/**
 * 普通房子建造实现类
 *
 * @author zhangxu
 * @date 2021/4/7 22:20
 */
public class CommonHouseBuilder extends HouseBuilder {
    @Override
    public void createBase() {
        house.setBase("普通房子打地基");
        System.out.println("普通房子打地基");
    }

    @Override
    public void createWall() {
        house.setWall("普通房子砌墙");
        System.out.println("普通房子砌墙");
    }

    @Override
    public void createRoof() {
        house.setRoof("普通房子封顶");
        System.out.println("普通房子封顶");
    }
}
