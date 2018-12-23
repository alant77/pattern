package com.alant.pattern.homework.abstra;

import com.alant.pattern.homework.AliRedisTempalte;
import com.alant.pattern.homework.BaiduRedisTemplate;
import com.alant.pattern.homework.RedisTemplate;
import com.alant.pattern.homework.TencentRedisTemplate;

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
