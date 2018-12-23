package com.alant.pattern.practice.simple;

import com.alant.pattern.practice.AliRedisTempalte;
import com.alant.pattern.practice.BaiduRedisTemplate;
import com.alant.pattern.practice.RedisTemplate;
import com.alant.pattern.practice.TencentRedisTemplate;

/**
 * @TianL
 * @2018/12/23
 * @简单工厂模式之redis操作
 */
public class SimpleFactory {
    RedisTemplate getRedisTemplateByName(String name) {
        if ("ali".equalsIgnoreCase(name)) {
            return new AliRedisTempalte();
        } else if ("tencent".equalsIgnoreCase(name)) {
            return new TencentRedisTemplate();
        } else if ("baidu".equalsIgnoreCase(name)) {
            return new BaiduRedisTemplate();
        } else {
            System.out.println("无此类型的redis实现");
            return null;
        }
    }
}
