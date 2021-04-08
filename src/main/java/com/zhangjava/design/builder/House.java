package com.zhangjava.design.builder;

/**
 * 房子（产品对象）
 *
 * @author zhangxu
 * @date 2021/4/7 22:15
 */
public class House {
    /**
     * 地基
     */
    private String base;

    /**
     * 墙
     */
    private String wall;

    /**
     * 房顶
     */
    private String roof;


    public void show() {
        System.out.println("这是一个房子");
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "base='" + base + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
