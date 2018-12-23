package com.alant.pattern.practice.simple;

import com.alant.pattern.practice.MengniuMilk;
import com.alant.pattern.practice.Milk;
import com.alant.pattern.practice.TelunsuMilk;
import com.alant.pattern.practice.YiliMilk;

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
