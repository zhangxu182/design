package com.zhangjava.design.factory.abs;

/**
 * 惠普电脑工厂
 *
 * @author zhangxu
 * @date 2021/4/7 16:01
 */
public class HPFactory implements AbsFactory {
    @Override
    public Keyboard createKeyboard() {
        return new HPKeyboard();
    }

    @Override
    public Monitor createMonitor() {
        return new HPMonitor();
    }

    @Override
    public MainFrame createMainFrame() {
        return new HPMainFrame();
    }

}

class HPKeyboard implements Keyboard {
    @Override
    public void show() {
        System.out.println("惠普键盘");
    }
}

class HPMonitor implements Monitor {
    @Override
    public void show() {
        System.out.println("惠普显示器");
    }
}

class HPMainFrame implements MainFrame {
    @Override
    public void show() {
        System.out.println("惠普主机");
    }
}
