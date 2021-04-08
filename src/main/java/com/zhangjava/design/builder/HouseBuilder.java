package com.zhangjava.design.builder;

/**
 * 产品的建造过程定义
 *
 * @author zhangxu
 * @date 2021/4/7 22:16
 */
public abstract class HouseBuilder {
    protected House house = new House();

    /**
     * 打地基
     */
    public abstract void createBase();

    /**
     * 砌墙
     */
    public abstract void createWall();

    /**
     * 封顶
     */
    public abstract void createRoof();

    /**
     * 返回产品对象
     *
     * @return
     */
    public House getHouse() {
        return house;
    }

}
