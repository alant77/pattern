package com.alant.pattern.homework.function;

import com.alant.pattern.homework.RedisTemplate;

/**
 * @TianL
 * @2018/12/23
 * @
 * 工厂方法模式
 * 生产redis操作模板
 */
public interface Factory {
    RedisTemplate getRedisTemplate();
}
