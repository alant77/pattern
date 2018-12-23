package com.alant.pattern.practice.function;

import com.alant.pattern.practice.AliRedisTempalte;
import com.alant.pattern.practice.RedisTemplate;

/**
 * @TianL
 * @2018/12/23
 * @
 */
public class AliRedisTemplateFactory implements Factory {
    @Override
    public RedisTemplate getRedisTemplate() {
        return new AliRedisTempalte();
    }
}
