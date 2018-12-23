package com.alant.pattern.learn.simple;

import com.alant.pattern.learn.MengniuMilk;
import com.alant.pattern.learn.Milk;
import com.alant.pattern.learn.TelunsuMilk;
import com.alant.pattern.learn.YiliMilk;

/**
 * 简单工厂模式，就像小作坊
 */
public class SimpleFactory {

    Milk getMilkByName(String name) {
        if ("telunsu".equalsIgnoreCase(name)) {
            return new TelunsuMilk();
        } else if ("yili".equalsIgnoreCase(name)) {
            return new YiliMilk();
        } else if ("mengniu".equalsIgnoreCase(name)) {
            return new MengniuMilk();
        } else {
            return null;
        }
    }
}
