package com.wbc.gerador.com.wbc.type.of.bird.refactoring;

public class African extends Bird {

    private int numberOfCoconuts;

    public African(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    double getSpeed() {

        return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
    }

    public int getBaseSpeed() {
        return 3+4;
    }

    public int getLoadFactor() {
        return 3;
    }
}