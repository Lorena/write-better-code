package com.wbc.gerador.com.wbc.type.of.bird.refactoring;

public class Europe extends Bird {
    double getSpeed() {
        return getBaseSpeed();
    }

    public double getBaseSpeed() {
        return 3.2;
    }
}