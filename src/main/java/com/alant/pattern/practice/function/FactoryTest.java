package com.alant.pattern.practice.function;

public class FactoryTest {
    public static void main(String[] args) {
        //用户想要伊利牛奶，那么就由伊利工厂为其提供
        Factory factory = new YiliFactory();
        System.out.println(factory.getMilk().getName());
        //想要蒙牛，就由蒙牛工厂提供
        Factory mengniuFac = new MengniuFactory();
        System.out.println(mengniuFac.getMilk().getName());
    }
}
