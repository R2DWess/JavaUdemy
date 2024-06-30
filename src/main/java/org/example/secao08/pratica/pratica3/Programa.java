package org.example.secao08.pratica.pratica3;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circunferencia(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2fn", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
    }
}
