package com.zhangjava.design.factory.abs;

/**
 * 戴尔电脑工厂
 *
 * @author zhangxu
 * @date 2021/4/7 16:04
 */
public class DellFactory implements AbsFactory {
    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }

    @Override
    public Monitor createMonitor() {
        return new DellMonitor();
    }

    @Override
    public MainFrame createMainFrame() {
        return new DellMainFrame();
    }
}

class DellKeyboard implements Keyboard {
    @Override
    public void show() {
        System.out.println("戴尔键盘");
    }
}

class DellMonitor implements Monitor {
    @Override
    public void show() {
        System.out.println("戴尔显示器");
    }
}

class DellMainFrame implements MainFrame {
    @Override
    public void show() {
        System.out.println("戴尔主机");
    }
}