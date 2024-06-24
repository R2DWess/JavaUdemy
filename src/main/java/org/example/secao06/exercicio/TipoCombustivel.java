package org.example.secao06.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class TipoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            System.out.println("Digite o tipo de combustível (1.Álcool 2.Gasolina 3.Diesel 4.Fim):");
            int tipo = sc.nextInt();

            if (tipo == 4) {
                break;
            }

            switch (tipo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.");
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}