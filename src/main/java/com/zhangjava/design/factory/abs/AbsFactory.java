package com.zhangjava.design.factory.abs;

/**
 * 抽象工厂类
 *
 * @author zhangxu
 * @date 2021/4/7 15:49
 */
public interface AbsFactory {
    /**
     * 创建键盘对象
     *
     * @return
     */
    Keyboard createKeyboard();

    /**
     * 创建显示器对象
     *
     * @return
     */
    Monitor createMonitor();

    /**
     * 创建主机对象
     *
     * @return
     */
    MainFrame createMainFrame();



    public static void main(String[] args) {
        AbsFactory factory = new HPFactory();
        factory.createKeyboard().show();
        factory.createMonitor().show();
        factory.createMainFrame().show();
    }
}
