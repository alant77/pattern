package com.alant.pattern.practice.abstra;

import com.alant.pattern.practice.AliRedisTempalte;
import com.alant.pattern.practice.BaiduRedisTemplate;
import com.alant.pattern.practice.RedisTemplate;
import com.alant.pattern.practice.TencentRedisTemplate;

/**
 * @TianL
 * @2018/12/24
 * @
 */
public class RedisTemplateFactory extends AbstractFactory {
    @Override
    RedisTemplate getAliRedisTemplate() {
        return new AliRedisTempalte();
    }

    @Override
    RedisTemplate getTencentRedisTemplate() {
        return new TencentRedisTemplate();
    }

    @Override
    RedisTemplate getBaiduRedisTemplate() {
        return new BaiduRedisTemplate();
    }
}
