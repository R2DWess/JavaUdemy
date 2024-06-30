package org.example.extra.pessoa;

import java.util.Scanner;

public class PessoaTestar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o nome da pessoa: ");
        pessoa.nome = sc.nextLine();

        System.out.println("Digite a idade da pessoa: ");
        pessoa.idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o sexo da pessoa: ");
        pessoa.sexo = sc.nextLine();

        System.out.println();
        System.out.println("Nome: " + pessoa.nome + " Idade: " + pessoa.idade + " Sexo: " + pessoa.sexo);

        sc.close();
    }
}
