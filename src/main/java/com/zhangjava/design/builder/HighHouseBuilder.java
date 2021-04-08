package com.zhangjava.design.builder;

/**
 * 高楼建造者
 *
 * @author zhangxu
 * @date 2021/4/7 22:21
 */
public class HighHouseBuilder extends HouseBuilder {
    @Override
    public void createBase() {
        house.setBase("高楼打地基");
        System.out.println("高楼打地基");
    }

    @Override
    public void createWall() {
        house.setWall("高楼水泥浇筑");
        System.out.println("高楼水泥浇筑");
    }

    @Override
    public void createRoof() {
        house.setRoof("高楼封顶");
        System.out.println("高楼封顶");
    }
}
