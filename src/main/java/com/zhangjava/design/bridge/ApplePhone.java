package com.zhangjava.design.bridge;

/**
 * 苹果
 *
 * @author zhangxu
 * @date 2021/4/12 13:52
 */
public class ApplePhone implements Brand {

    @Override
    public String show() {
        return "苹果";
    }
}
