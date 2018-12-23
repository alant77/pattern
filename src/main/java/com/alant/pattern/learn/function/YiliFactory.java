package com.alant.pattern.learn.function;

import com.alant.pattern.learn.Milk;
import com.alant.pattern.learn.YiliMilk;

public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new YiliMilk();
    }
}
