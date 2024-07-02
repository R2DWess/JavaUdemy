package org.example.secao10.pratica.produto;

import java.util.Locale;
import java.util.Scanner;

public class entities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect [i].getPreco();
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
