package com.zhangjava.design.adapter.obj;

/**
 * 适配器类
 *
 * @author zhangxu
 * @date 2021/4/8 22:07
 */
public class VoltageAdapter implements IVoltage5 {
    private Voltage220 voltage220;

    public Voltage220 getVoltage220() {
        return voltage220;
    }

    public void setVoltage220(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int out5v() {
        // 方法适配
        int v = voltage220.out220v();
        System.out.println("==== 方法适配 ====");
        return v / 44;
    }

}
