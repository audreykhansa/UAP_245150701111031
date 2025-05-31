package models;

import bases.Shape;
import interfaces.ThreeDimensional;
import interfaces.PiRequired;
import interfaces.MassCalculable;
import interfaces.MassConverter;
import interfaces.ShippingCostCalculator;

public class Sphere extends Shape implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double radius; 

    public Sphere() {
        super();
    }

    public Sphere(double radius) {
        super();
        this.radius = radius;
    }

    public double dapatkanJejari() { 
        return radius;
    }

    public void aturJejari(double jejariBaru) { 
        this.radius = jejariBaru;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * this.radius * this.radius * this.radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * this.radius * this.radius;
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume\t\t\t: %.2f cm^3\n", getVolume());
        System.out.printf("Luas permukaan\t\t: %.2f cm^2\n", getSurfaceArea());
        System.out.printf("Massa\t\t\t: %.2f gr\n", getMass());
    }

    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        double massInKg = gramToKilogram();
        return Math.ceil(massInKg) * PRICE_PER_KG;
    }
}