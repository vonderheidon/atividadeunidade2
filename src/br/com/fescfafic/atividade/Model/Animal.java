package br.com.fescfafic.atividade.Model;

public abstract class Animal {
    public String especie;
    public String nome;
    public int qtdDePatas;
    public double peso;

    public Animal (String especie, String nome, int qtdDePatas, double peso) {
        this.especie = especie;
        this.nome = nome;
        this.qtdDePatas = qtdDePatas;
        this.peso = peso;
    }

    public void AbrirAsas() {
        System.out.println("Abrindo asas");
    }
    public void AbrirABarrigaDeUmaPessoaComUmaMordida() {
        System.out.println("Abrindo a barriga de uma pessoa com uma mordida");
    }
    public void Amamentar() {
        System.out.println("Amamentando");
    }
    public void Voar() {
        System.out.println("Voando");
    }
}