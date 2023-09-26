package br.com.fescfafic.atividade.Model;

public class Lobo extends Animal {
    public Lobo(String especie, String nome, int qtdDePatas, double peso) {
        super(especie, nome, qtdDePatas, peso);
    }
    @Override
    public void Voar() {
        System.out.println("Lobo nao voa");
    }
    @Override
    public void AbrirAsas() {
        System.out.println("Lobo nao tem asas");
    }
}
