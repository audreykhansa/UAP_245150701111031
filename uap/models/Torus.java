package models;

import bases.Shape;

public class Torus extends Shape {
    private double R, r;

    public Torus(double R, double r) {
        this.R = R;
        this.r = r;
    }

    public double hitungVolume() {
        return 2 * PI * PI * R * r * r;
    }

    public double hitungLuasPermukaan() {
        return 4 * PI * PI * R * r;
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