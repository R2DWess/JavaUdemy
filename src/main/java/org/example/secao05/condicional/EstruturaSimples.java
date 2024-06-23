package org.example.secao05.condicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite as horas atuais:");
        double horario = sc.nextDouble();


        if (horario >= 06 && horario <= 11.59) {
            System.out.println("Bom dia");
        } else if (horario >= 12.00 && horario <= 17.59) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}
