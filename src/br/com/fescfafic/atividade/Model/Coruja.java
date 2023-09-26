package br.com.fescfafic.atividade.Model;

public class Coruja extends Animal {
    public Coruja(String especie, String nome, int qtdDePatas, double peso) {
        super(especie, nome, qtdDePatas, peso);
    }
    @Override
    public void AbrirABarrigaDeUmaPessoaComUmaMordida() {
        System.out.println("A coruja nao consegue abrir a barriga de uma pessoa com uma mordida, ela bica.");
    }

    @Override
    public void Amamentar() {
        System.out.println("Corujas nao amamentam.");
    }
}
