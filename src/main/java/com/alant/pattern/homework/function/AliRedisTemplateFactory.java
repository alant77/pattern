package com.alant.pattern.homework.function;

import com.alant.pattern.homework.AliRedisTempalte;
import com.alant.pattern.homework.RedisTemplate;

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
