package com.alant.pattern.learn.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        //简单工厂模式，就像小作坊生产
        //用户说来一个伊利牛奶,小作坊就根据用户需求生产
        //用户不再需要关心怎么生产的了
        SimpleFactory factory = new SimpleFactory();
        System.out.println(factory.getMilkByName("yili").getName());
    }
}
