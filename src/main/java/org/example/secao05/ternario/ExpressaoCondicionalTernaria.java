package org.example.secao05.ternario;

import java.util.Locale;
import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("O valor com desconto é de: " + desconto);
    }
}
