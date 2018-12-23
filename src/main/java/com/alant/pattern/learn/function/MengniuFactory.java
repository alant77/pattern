package com.alant.pattern.learn.function;

import com.alant.pattern.learn.MengniuMilk;
import com.alant.pattern.learn.Milk;

public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new MengniuMilk();
    }
}
