package br.com.fescfafic.atividade.Model;

public class Papagaio extends Animal {
    public Papagaio(String especie, String nome, int qtdDePatas, double peso) {
        super(especie, nome, qtdDePatas, peso);
    }
    @Override
    public void AbrirABarrigaDeUmaPessoaComUmaMordida() {
        System.out.println("O papagaio nao consegue abrir a barriga de uma pessoa com uma mordida, ele bica.");
    }

    @Override
    public void Amamentar() {
        System.out.println("Papagaios nao amamentam.");
    }
}
