package org.example.extra.produto;

import java.util.Locale;
import java.util.Scanner;

public class ProdutoTestar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Construtor padrão:
        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "Bic";
        p1.velor = 1.50f;

        // Construtor de dois parâmetros:
        Produto p2 = new Produto("Caneta vermelha", " Faber");
        p2.velor = 1.69f;

        // Construtor de três parâmetros:
        Produto p3 = new Produto("Borracha ", " Mercur ", 1.89f);

        System.out.println("Nome:" + p1.nome + "Marca: " + p1.marca + " Valor " + p1.velor);
        System.out.println("Nome:" + p2.nome + "Marca: " + p2.marca + " Valor " + p2.velor);
        System.out.println("Nome:" + p3.nome + "Marca: " + p3.marca + " Valor " + p3.velor);
    }
}
