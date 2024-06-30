package org.example.secao08.pratica3;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter radius: ");
        double raio = sc.nextDouble();

        Esfera esfera = new Esfera();
        esfera.setRaio(raio);

        double circunferencia = esfera.calcularCircunferencia();
        double volume = esfera.calcularVolume();

        System.out.printf("Circumference: %.2f%n", circunferencia);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", Math.PI);

        sc.close();
    }
}
