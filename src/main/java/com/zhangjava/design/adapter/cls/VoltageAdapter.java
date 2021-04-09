package com.zhangjava.design.adapter.cls;

/**
 * 适配器类
 *
 * @author zhangxu
 * @date 2021/4/8 22:07
 */
public class VoltageAdapter extends Voltage220 implements IVoltage5 {

    @Override
    public int out5v() {
        // 方法适配
        int v = out220v();
        System.out.println("==== 方法适配 ====");
        return v / 44;
    }

}
