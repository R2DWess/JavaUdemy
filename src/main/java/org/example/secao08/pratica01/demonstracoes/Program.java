package org.example.secao08.pratica01.demonstracoes;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Insira as medidas do triangulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Insira as medidas do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do Triângulo X: %.4f%n", areaX);
        System.out.printf("Área do Triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }
        sc.close();
    }
}
