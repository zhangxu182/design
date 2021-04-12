package com.zhangjava.design.bridge;

/**
 * 智能手机
 *
 * @author zhangxu
 * @date 2021/4/12 13:58
 */
public class SmartPhone extends Phone {
    public SmartPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected String open() {
        return super.open() + "智能手机";
    }

    @Override
    protected String close() {
        return super.close() + "智能手机";
    }

    @Override
    protected String call() {
        return super.call() + "智能手机";
    }
}
