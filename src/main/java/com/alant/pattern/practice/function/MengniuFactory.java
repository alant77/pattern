package com.alant.pattern.practice.function;

import com.alant.pattern.practice.MengniuMilk;
import com.alant.pattern.practice.Milk;

public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new MengniuMilk();
    }
}
