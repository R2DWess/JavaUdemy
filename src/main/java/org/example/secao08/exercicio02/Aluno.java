package org.example.secao08.exercicio02;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }

    public boolean isAprovado(){
        return notaFinal() >= 60;
    }

    public double pontosParaAprovacao(){
        if (!isAprovado()){
            return 60 - notaFinal();
        } else {
            return 0;
        }
    }
}
