package br.com.fescfafic.atividade.Main;


import br.com.fescfafic.atividade.Model.Leao;
import br.com.fescfafic.atividade.Model.Lobo;
import br.com.fescfafic.atividade.Model.Coruja;
import br.com.fescfafic.atividade.Model.Papagaio;

public class Main {
    public static void main(String[] args) {
        Papagaio papagaio = new Papagaio(
                "Papagaio Goteira Azul",
                "Rogerinho",
                2,
                0.81
        );
        System.out.println(papagaio.especie);
        papagaio.AbrirABarrigaDeUmaPessoaComUmaMordida();
        papagaio.AbrirAsas();
        papagaio.Amamentar();
        papagaio.Voar();
        System.out.println("=============================================");

        Coruja coruja = new Coruja(
                "Coruja Pente Gola",
                "Mocreia",
                2,
                0.65
        );
        System.out.println(coruja.especie);
        coruja.AbrirABarrigaDeUmaPessoaComUmaMordida();
        coruja.AbrirAsas();
        coruja.Amamentar();
        coruja.Voar();
        System.out.println("=============================================");

        Leao leao = new Leao(
                "Leao Pano de Pia",
                "Juvencio",
                4,
                50
        );
        System.out.println(leao.especie);
        leao.AbrirABarrigaDeUmaPessoaComUmaMordida();
        leao.AbrirAsas();
        leao.Amamentar();
        leao.Voar();
        System.out.println("=============================================");

        Lobo lobo = new Lobo(
                "Lobo Pele Tranca Rua",
                "Macaco",
                4,
                12
        );
        System.out.println(lobo.especie);
        lobo.AbrirABarrigaDeUmaPessoaComUmaMordida();
        lobo.AbrirAsas();
        lobo.Amamentar();
        lobo.Voar();
    }
}