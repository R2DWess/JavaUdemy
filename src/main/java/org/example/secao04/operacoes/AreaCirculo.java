package org.example.secao04.operacoes;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor do raio: ");
        double r = sc.nextDouble();

        double pi = 3.14159;

        double area;

        area = pi * (r * r);

        System.out.println("O valor da área do Circulo é: " + area);
    }
}
