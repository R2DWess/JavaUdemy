package org.example.secao08.pratica.pratica02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Produto produto = new Produto();
        System.out.println("Insira a data do produto: ");
        System.out.println("Nome: ");

        produto.nome = sc.nextLine();
        System.out.print("Preço: ");

        produto.preco = sc.nextDouble();
        System.out.println("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.println("Insira o numero de produtos para adicionar no estoque: ");
        int quantidade = sc.nextInt();
        produto.addProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println();
        System.out.println("Insira o numero de produtos para serem removidos no estoque: ");
        quantidade = sc.nextInt();
        produto.removeProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}
