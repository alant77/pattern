package com.alant.pattern.practice.abstra;

import com.alant.pattern.practice.RedisTemplate;

/**
 * @TianL
 * @2018/12/23
 * @抽象工厂模式
 */
public abstract class AbstractFactory {
    abstract RedisTemplate getAliRedisTemplate();
    abstract RedisTemplate getTencentRedisTemplate();
    abstract RedisTemplate getBaiduRedisTemplate();
}
