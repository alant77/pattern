package com.alant.pattern.homework.abstra;

/**
 * @TianL
 * @2018/12/24
 * @
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //用户无需知道任何关于redis操作实现类的信息
        //因为用户只需要根据所需进行选择即可，如果没有所需要的实现怎么办？
        //这时服务方可根据用户需要方便实现功能扩展
        //这也符合了设计模式中的开闭原则
        RedisTemplateFactory factory = new RedisTemplateFactory();
        System.out.println(factory.getAliRedisTemplate().remove("key"));
    }
}
