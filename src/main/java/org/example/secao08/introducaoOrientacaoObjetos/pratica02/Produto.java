package org.example.secao08.introducaoOrientacaoObjetos.pratica02;

public class Produto {

    // Declaração de atributos
    public String nome;
    public double preco;
    public int quantidade;

    public double totalValueInStock(){
        return preco * quantidade;

    }

    public void addProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
                + ", $ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
}
}
