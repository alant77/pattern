package com.alant.pattern.practice.abstr;

import com.alant.pattern.practice.Milk;

/**
 * @TianL
 * @2018/12/23
 * @
 * 抽象工厂模式，工厂模式中比较复杂一种，也是应用很广泛的一种
 * 这里为什么用到抽象类而不用接口呢？
 * 1.接口是特殊的抽象类，他们都是对事物共性的抽取
 * 2.接口只能定义一个标准，没有自己的实现逻辑，而抽象类除了接口能实现的功能，还能有自己的实现逻辑
 *
 *
 */
public abstract class AbstractFactory {
    //可以定义共有的逻辑
    //...1,2,3...实现流水线

    //每种牛奶去实现特有的东西
    abstract Milk getYiliMilk();
    abstract Milk getMengniuMilk();
    abstract Milk getTelunsuMilk();
    abstract Milk getSanyuanMilk();
}
