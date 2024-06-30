package org.example.extra.passaro;

public class Animal {

    String nome;
    String tipo;
    String raça;
    String som;
    int velocidade;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Animal(String nome, String tipo, String raça) {
        this.nome = nome;
        this.tipo = tipo;
        this.raça = raça;
    }

    public Animal(String nome, String tipo, String raça, String som) {
        this.nome = nome;
        this.tipo = tipo;
        this.raça = raça;
        this.som = som;
    }

    public Animal(String nome, String tipo, String raça, String som, int velocidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.raça = raça;
        this.som = som;
        this.velocidade = velocidade;
    }
}
