package org.example.secao08.exercicio.exercicio01;

public class Funcionario {

    // Declaração de atributos
    String nome;
    double salarioBruto;
    Double impostos = 1000.00;

    // Metodo para calcular o salário liquido
    public double salarioLiquido(){
        return (salarioBruto - impostos); // Responsável por calcular o salário líquido substraindo do salário bruto.
    }

    // Método para aumentar o salário bruto com base em uma porcentagem
    public void aumentarSalario(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100; // Aumenta o salário burto em 10%
    }

    // Método toString para exibir os dados do funcionário
    public String toString(){
        return nome + ", $ " + String.format("%.2f", salarioLiquido()); // Retorna uma String com o nome do funcionário e useu salário líquido formatado.
    }

}
