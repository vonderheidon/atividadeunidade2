package br.com.fescfafic.atividade.Model;

public class Leao extends Animal {
    public Leao(String especie, String nome, int qtdDePatas, double peso) {
        super(especie, nome, qtdDePatas, peso);
    }
    @Override
    public void Voar() {
        System.out.println("Leao nao voa");
    }
    @Override
    public void AbrirAsas() {
        System.out.println("Leao nao tem asas");
    }
}
