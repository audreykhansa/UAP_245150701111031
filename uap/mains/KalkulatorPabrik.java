package mains;

import java.util.Scanner;
import java.util.Locale;
import models.Torus;
import models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("AUDREY KHANSA LARASATI");
        System.out.println("245150701111031");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = input.nextDouble();
        System.out.print("Isikan radius   : ");
        double r = input.nextDouble();
        Torus torus = new Torus(R, r);
        System.out.println("=============================================");
        torus.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double rs = input.nextDouble();
        Sphere sphere = new Sphere(rs);
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("=============================================");

        input.close();
    }
}