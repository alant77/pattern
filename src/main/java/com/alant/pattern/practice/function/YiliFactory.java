package com.alant.pattern.practice.function;

import com.alant.pattern.practice.Milk;
import com.alant.pattern.practice.YiliMilk;

public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new YiliMilk();
    }
}
