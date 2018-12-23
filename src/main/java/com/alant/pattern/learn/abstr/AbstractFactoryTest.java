package com.alant.pattern.learn.abstr;

/**
 * @TianL
 * @2018/12/23
 * @
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //此时用户也不再需要关心牛奶是什么工厂生产的
        //用户需要什么牛奶，可以自行进行选择
        AbstractFactory factory = new MilkFactory();
        System.out.println(factory.getMengniuMilk());
        System.out.println(factory.getTelunsuMilk());
        System.out.println(factory.getSanyuanMilk().getName());
    }
}
