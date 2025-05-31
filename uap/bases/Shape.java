package bases;

import interfaces.*;

public abstract class Shape implements ThreeDimensional, MassCalculable, MassConverter, ShippingCostCalculator, PiRequired {
    protected static final double MASSA_JENIS = 8.0;

    public double konversiKg(double massaGram) {
        return massaGram / 1000.0;
    }

    public int biayaKirim(double massaKg) {
        return (int) Math.ceil(massaKg) * 10000;
    }

    public abstract void printInfo();
}