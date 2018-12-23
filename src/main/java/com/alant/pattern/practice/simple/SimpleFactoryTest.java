package com.alant.pattern.practice.simple;

/**
 * @TianL
 * @2018/12/23
 * @
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        //用户需要使用哪种redis，需要自己知道标识
        SimpleFactory factory = new SimpleFactory();

        System.out.println(factory.getRedisTemplateByName("jingdong"));
        System.out.println(factory.getRedisTemplateByName("ali"));
    }
}
