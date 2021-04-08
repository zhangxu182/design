package com.zhangjava.design.builder;

/**
 * 建造房子指挥者
 *
 * @author zhangxu
 * @date 2021/4/7 22:23
 */
public class HouseDirector {
    private HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 封装建造过程
     *
     * @return
     */
    public House buildHouse() {
        houseBuilder.createBase();
        houseBuilder.createWall();
        houseBuilder.createRoof();
        return houseBuilder.getHouse();
    }

}
