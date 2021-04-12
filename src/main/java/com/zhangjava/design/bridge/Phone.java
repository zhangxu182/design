package com.zhangjava.design.bridge;

/**
 * 手机
 *
 * @author zhangxu
 * @date 2021/4/12 13:55
 */
public abstract class Phone {
    /**
     * 组合品牌
     */
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected String open() {
        return brand.show() + "开机";
    }

    protected String close() {
        return brand.show() + "关机";
    }

    protected String call() {
        return brand.show() + "打电话";
    }

}
