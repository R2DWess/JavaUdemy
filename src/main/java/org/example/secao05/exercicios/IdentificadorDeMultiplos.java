package org.example.secao05.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IdentificadorDeMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o primeiro valor:");
        int primeiroValor = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        int segundoValor = sc.nextInt();

        if (primeiroValor % segundoValor == 0 || segundoValor % primeiroValor == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
