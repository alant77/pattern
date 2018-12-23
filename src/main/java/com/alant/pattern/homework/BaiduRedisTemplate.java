package com.alant.pattern.homework;

/**
 * @TianL
 * @2018/12/23
 * @百度redis
 */
public class BaiduRedisTemplate implements RedisTemplate {
    @Override
    public boolean set(String key, String value) {
        System.out.println("百度redis添加成功");
        return true;
    }

    @Override
    public boolean remove(String key) {
        System.out.println("百度redis删除成功");
        return true;
    }
}
