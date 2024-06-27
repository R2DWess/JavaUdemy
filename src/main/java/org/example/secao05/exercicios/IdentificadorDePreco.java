package org.example.secao05.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class IdentificadorDePreco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double xSalada = 4.50;
        double xBacon = 5.00;
        double torradaSimples = 2.00;
        double refrigeirante = 1.50;

        System.out.println("Digite o código do item:");
        int codigo = sc.nextInt();

        System.out.println("Digite a quantidade do item: ");
        int quantidade = sc.nextInt();

        double total;

        switch(codigo){
            case 1:
                double cachorroQuente = 4.00;
                int adicional = sc.nextInt();
                System.out.println("Cachorro Quente");
                total = quantidade * cachorroQuente;

                System.out.println("Total: R$: " + total);

                if (codigo == 1){
                    total = (quantidade + adicional) * cachorroQuente;

                }

                break;
            case 2:
                System.out.println("Cachorro X-Salada");
                total = quantidade * xSalada;

                System.out.println("Total: R$: " + total);
                break;
            case 3:
                System.out.println("Cachorro X-Bacon");
                total = quantidade * xBacon;

                System.out.println("Total: R$: " + total);
                break;
            case 4:
                System.out.println("Cachorro Torrada simples");
                total = quantidade * torradaSimples;

                System.out.println("Total: R$: " + total);
                break;
            case 5:
                System.out.println("Cachorro Refrigeirante");
                total = quantidade * refrigeirante;

                System.out.println("Total: R$: " + total);
                break;
        }
    }
}
