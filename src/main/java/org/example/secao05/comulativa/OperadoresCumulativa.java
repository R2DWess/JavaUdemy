package org.example.secao05.comulativa;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresCumulativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o valor de consumo: ");
        int minutos = sc.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta =  R$ %.2f%n", conta);

        sc.close();
    }
}
