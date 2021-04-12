package com.zhangjava.design.bridge;

/**
 * 普通手机
 * 
 * @author zhangxu
 * @date 2021/4/12 14:07
 */
public class CommonPhone extends Phone {
    public CommonPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected String open() {
        return super.open() + "普通手机";
    }

    @Override
    protected String close() {
        return super.close() + "普通手机";
    }

    @Override
    protected String call() {
        return super.call() + "普通手机";
    }
}
