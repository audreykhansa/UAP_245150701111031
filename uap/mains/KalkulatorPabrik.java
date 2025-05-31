package mains;

import models.Torus;
import models.Sphere;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class KalkulatorPabrik {

    public static void main(String[] args) {
        Scanner inputPengguna = new Scanner(System.in);

        String garisPemisah = "=============================================";
        System.out.println(garisPemisah);
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("AUDREY KHANSA LARASATI");
        System.out.println("245150701111031");

        DecimalFormatSymbols simbolFormatLokal = new DecimalFormatSymbols(new Locale("id", "ID"));
        simbolFormatLokal.setGroupingSeparator('.');
        DecimalFormat formatAngka = new DecimalFormat("###,###", simbolFormatLokal);

        System.out.println(garisPemisah);
        System.out.println("Donat dengan lubang");
        System.out.println(garisPemisah);
        
        System.out.printf("%-18s: ", "Isikan Radius");
        double jejariUtamaTorus = inputPengguna.nextDouble();

        System.out.printf("%-18s: ", "Isikan radius");
        double jejariKecilTorus = inputPengguna.nextDouble();
        System.out.println(garisPemisah);

        Torus cetakanDonatTorus = new Torus(jejariUtamaTorus, jejariKecilTorus);
        cetakanDonatTorus.printInfo();
        System.out.printf("Massa dalam kg\t\t: %.3f kg\n", cetakanDonatTorus.gramToKilogram());
        System.out.printf("Biaya kirim\t\t: Rp%s\n", formatAngka.format(cetakanDonatTorus.calculateCost()));
        System.out.println(garisPemisah);

        System.out.println("Donat tanpa lubang");
        System.out.println(garisPemisah);

        System.out.printf("%-18s: ", "Isikan radius");
        double jejariBola = inputPengguna.nextDouble();
        System.out.println(garisPemisah);

        Sphere cetakanDonatBola = new Sphere(jejariBola);
        cetakanDonatBola.printInfo();
        System.out.printf("Massa dalam kg\t\t: %.3f kg\n", cetakanDonatBola.gramToKilogram());
        System.out.printf("Biaya kirim\t\t: Rp%s\n", formatAngka.format(cetakanDonatBola.calculateCost()));
        System.out.println(garisPemisah);

        inputPengguna.close();
    }
}