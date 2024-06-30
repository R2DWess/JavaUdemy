package org.example.extra.passaro;

import java.util.Scanner;

public class AnimalTestar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();

        System.out.println("Primeiro animal: ");
        System.out.println("Digite o nome do animal: ");
        a1.nome = sc.nextLine();
        System.out.println("Digite o tipo do animal: ");
        a1.tipo = sc.nextLine();
        System.out.println("Digite o som do animal: ");
        a1.som = sc.nextLine();
        System.out.println("Digite a raça do animal: ");
        a1.raça = sc.nextLine();
        System.out.println("Digite a velocidade do animal: ");
        a1.velocidade = sc.nextInt();
        sc.nextLine();

        System.out.println("Segundo animal: ");
        System.out.println("Digite o nome do animal: ");
        a2.nome = sc.nextLine();
        System.out.println("Digite o tipo do animal: ");
        a2.tipo = sc.nextLine();
        System.out.println("Digite o som do animal: ");
        a2.som = sc.nextLine();
        System.out.println("Digite a raça do animal: ");
        a2.raça = sc.nextLine();
        System.out.println("Digite a velocidade do animal: ");
        a2.velocidade = sc.nextInt();
        sc.nextLine();

        System.out.println("Terceiro animal: ");
        System.out.println("Digite o nome do animal: ");
        a3.nome = sc.nextLine();
        System.out.println("Digite o tipo do animal: ");
        a3.tipo = sc.nextLine();
        System.out.println("Digite o som do animal: ");
        a3.som = sc.nextLine();
        System.out.println("Digite a raça do animal: ");
        a3.raça = sc.nextLine();
        System.out.println("Digite a velocidade do animal: ");
        a3.velocidade = sc.nextInt();
        sc.nextLine();
    }
}
