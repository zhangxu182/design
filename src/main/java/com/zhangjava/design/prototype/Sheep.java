package com.zhangjava.design.prototype;

import java.io.Serializable;

/**
 * 原型模式
 *
 * @author zhangxu
 * @date 2021/4/7 16:52
 */
public class Sheep implements Cloneable, Serializable {
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    public String getName() {
        return name;
    }

    /**
     * 重写clone方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep();
        sheep.setAge(2);
        sheep.setName("多利");

        // 对象克隆
        Sheep sheep1 = sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep1);
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

