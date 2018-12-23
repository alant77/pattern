package com.alant.pattern.homework;

/**
 * @TianL
 * @2018/12/23
 * @redis基本操作
 */
public interface RedisTemplate {
    boolean set(String key, String value);
    boolean remove(String key);
}
