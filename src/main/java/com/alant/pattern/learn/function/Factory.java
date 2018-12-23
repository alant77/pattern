package com.alant.pattern.learn.function;

import com.alant.pattern.learn.Milk;

/**
 * 工厂方法模式
 * 标准的工厂生产模式
 * 不同的类型的牛奶会有对应的工厂去生产，而不再是一个工厂生产所有类型的牛奶
 */
public interface Factory {
    Milk getMilk();
}
