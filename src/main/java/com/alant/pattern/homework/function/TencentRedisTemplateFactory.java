package com.alant.pattern.homework.function;

import com.alant.pattern.homework.RedisTemplate;
import com.alant.pattern.homework.TencentRedisTemplate;

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
