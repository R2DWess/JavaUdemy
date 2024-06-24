package org.example.secao06.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class LeituraSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 2002) {

            System.out.println("Senha incorreta, digite novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("SENHA CORRETA");

        sc.close();
    }
}
