package com.alant.pattern.practice.function;

/**
 * @TianL
 * @2018/12/23
 * @
 */
public class FactoryTest {
    public static void main(String[] args) {
        //用户想要哪种redis实现呢， 还需要去拿到对应生产实现模板的工厂
        Factory factory = new AliRedisTemplateFactory();
        System.out.println(factory.getRedisTemplate().set("key", "value"));
    }
}
