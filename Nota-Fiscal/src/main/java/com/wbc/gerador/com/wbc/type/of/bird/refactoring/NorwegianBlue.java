package com.wbc.gerador.com.wbc.type.of.bird.refactoring;

class NorwegianBlue extends Bird {
    double getSpeed() {
        return (isNailed()) ? 0 : getBaseSpeed(4.3);
    }

    private double getBaseSpeed(double v) {
        return 0;
    }

    public boolean isNailed() {
        return true;
    }
}