package com.alant.pattern.homework;

/**
 * @TianL
 * @2018/12/23
 * @阿里云
 */
public class AliRedisTempalte implements RedisTemplate {
    @Override
    public boolean set(String key, String value) {
        System.out.println("阿里redis添加成功");
        return true;
    }

    @Override
    public boolean remove(String key) {
        System.out.println("阿里redis删除成功");
        return true;
    }
}
