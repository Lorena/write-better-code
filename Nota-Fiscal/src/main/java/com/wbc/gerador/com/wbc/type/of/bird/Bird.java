package com.wbc.gerador.com.wbc.type.of.bird;

public class Bird {

    private static final int EUROPE = 1;
    private static final int AFRICAN = 2;
    private static final int NORWEGIAN_BLUE = 3;

    private int type;
    private int numberOfCoconuts = 0;

    public Bird(int type) {
        this.type = type;
    }

    double getSpeed() {
        switch (type) {
            case EUROPE:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
            case NORWEGIAN_BLUE:
                return (isNailed()) ? 0 : getBaseSpeed(4.3);
        }
        throw new RuntimeException("Should be unreachable");
    }

    private double getBaseSpeed() {
        return 0;
    }

    public int getBaseSpeed(double valor) {
        return 4;
    }

    public int getLoadFactor() {
        return 2;
    }

    public boolean isNailed() {
        return true;
    }
}