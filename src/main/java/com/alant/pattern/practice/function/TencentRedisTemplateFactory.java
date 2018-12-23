package com.alant.pattern.practice.function;

import com.alant.pattern.practice.RedisTemplate;
import com.alant.pattern.practice.TencentRedisTemplate;

/**
 * @TianL
 * @2018/12/23
 * @
 */
public class TencentRedisTemplateFactory implements Factory {
    @Override
    public RedisTemplate getRedisTemplate() {
        return new TencentRedisTemplate();
    }
}
