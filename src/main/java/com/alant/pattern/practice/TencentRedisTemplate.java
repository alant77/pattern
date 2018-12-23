package com.alant.pattern.practice;

/**
 * @TianL
 * @2018/12/23
 * @腾讯redis
 */
public class TencentRedisTemplate implements RedisTemplate {
    @Override
    public boolean set(String key, String value) {
        System.out.println("腾讯redis添加成功");
        return true;
    }

    @Override
    public boolean remove(String key) {
        System.out.println("腾讯redis删除成功");
        return true;
    }
}
