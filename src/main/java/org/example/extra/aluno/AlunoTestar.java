package org.example.extra.aluno;

import java.util.Scanner;

public class AlunoTestar {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.setNome("Wesley");
        System.out.println("Nome: " + aluno1.getNome());

        aluno1.setIdade(5020);
    }
}
