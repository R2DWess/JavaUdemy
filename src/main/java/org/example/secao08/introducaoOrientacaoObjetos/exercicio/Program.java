package org.example.secao08.introducaoOrientacaoObjetos.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Funcionario funcionario = new Funcionario(); // Criando instância da classe Funcionario

        System.out.println("Insira os dados do funcionário: ");
        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine(); // Leitura do nome do funcionário

        System.out.println("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble(); // Leitura do salário bruto do funcionário

        System.out.println("Imposto: ");
        funcionario.impostos = sc.nextDouble(); // Leitura do valor de imposto

        System.out.println();
        System.out.println("Funcionário: " + funcionario);

        System.out.println();
        System.out.println("Qual a porcentagem para aumentar o salário? ");
        double porcentagem = sc.nextDouble(); // Ler a porcentagem de aumento do salário do usuário

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario); // Exibir os dados atualizados do funcionário

        sc.close();
    }
}
