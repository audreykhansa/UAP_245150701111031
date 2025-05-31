package models;

import bases.Shape;

public class Sphere extends Shape {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double hitungVolume() {
        return (4.0 / 3.0) * PI * r * r * r;
    }

    public double hitungLuasPermukaan() {
        return 4 * PI * r * r;
    }

    public double hitungMassa() {
        return hitungVolume() * MASSA_JENIS;
    }

    public void printInfo() {
        double volume = hitungVolume();
        double luas = hitungLuasPermukaan();
        double massa = hitungMassa();
        double massaKg = konversiKg(massa);
        int biaya = biayaKirim(massaKg);

        System.out.printf("Volume          : %.2f cm^3\n", volume);
        System.out.printf("Luas permukaan  : %.2f cm^2\n", luas);
        System.out.printf("Massa           : %.2f gr\n", massa);
        System.out.printf("Massa dalam kg  : %.2f kg\n", massaKg);
        System.out.printf("Biaya kirim     : Rp%d\n", biaya);
    }
}