package com.alant.pattern.learn.abstr;

import com.alant.pattern.learn.*;

/**
 * @TianL
 * @2018/12/23
 * @
 */
public class MilkFactory extends AbstractFactory {
    @Override
    Milk getYiliMilk() {
        return new YiliMilk();
    }

    @Override
    Milk getMengniuMilk() {
        return new MengniuMilk();
    }

    @Override
    Milk getTelunsuMilk() {
        return new TelunsuMilk();
    }

    @Override
    Milk getSanyuanMilk() {
        return new SanyuanMilk();
    }
}
