package com.mycompany.associacoes_campeonatofutebol;

import java.util.ArrayList;

public class Associacoes_campeonatoFutebol {

    public static void main(String[] args) {
        final int QTD_TIMES = 10;
        final String TITULO = "CAMPEONATO DE FUTEBOL";
        int opcao = 0;
        Campeonato campeonato = new Campeonato();
        campeonato.imprimirTabela();

        String menu = "ESCOLHA UM OPÇÃO:\n\n"
                + "1 - Cadastrar um novo time\n\n"
                + "2 - Simular jogos\n\n"
                + "3 - Sair\n\n";
        while (opcao != 3) {

            try {
                opcao = EntradaSaida.lerInteiro(TITULO, menu);
            } catch (NumberFormatException ex) {
                EntradaSaida.exibirMensagem("OPCÃO INVÁLIDA! TENTE NOVAMENTE");
            }
            switch (opcao) {
                case 1:
                    if (campeonato.times.size() < QTD_TIMES) {
                        String nome = EntradaSaida.lerString(TITULO, "Digite o nome do time: ");
                        Time t = new Time(nome);
                        campeonato.times.add(t);
                    } else {
                        EntradaSaida.exibirMensagem("Apenas " + QTD_TIMES + " times são permitidos!!");
                    }

                    break;

                case 2:
                    String listaTimes = "Lista de times\n";

                    for (int i = 0; i < campeonato.times.size(); i++) {
                        Time time = campeonato.times.get(i);
                        listaTimes += (i + 1) + " - " + time.getNome() + "\n";
                    }
                    int primeiroTime = EntradaSaida.lerInteiro(TITULO, listaTimes + "Escolha o primeiro time");
                    int segundoTime = EntradaSaida.lerInteiro(TITULO, listaTimes + "Escolha o segundo time");
                    Time time1 = campeonato.times.get(primeiroTime - 1);
                    Time time2 = campeonato.times.get(segundoTime - 1);
                    if (time1 == time2) {
                        EntradaSaida.exibirMensagem("Você escolheu o mesmo time 2 vezes!!");
                        break;
                    }
                    Jogo jogo = new Jogo(time1, time2);
                    boolean achou = false;
                    for (int i = 0; i < campeonato.jogos.size(); i++) {
                        Jogo j = campeonato.jogos.get(i);
                        if ((j.getTime1() == time1 || j.getTime1() == time2) && (j.getTime2() == time1 || j.getTime2() == time2)) {
                            EntradaSaida.exibirMensagem("Este jogo ja foi realizado!! Escolha outra dupla de jogos.");
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        jogo.simularJogo();
                        campeonato.jogos.add(jogo);
                        campeonato.imprimirTabela();
                    }
                    if (((campeonato.times.size() * (campeonato.times.size() - 1)) / 2) == campeonato.jogos.size()) {
                        Time campeao = new Time(" ");

                        for (int i = 0; i < campeonato.jogos.size(); i++) {
                            if (campeao.getTotalPontos() < campeonato.times.get(i).getTotalPontos()) {
                                campeao = campeonato.times.get(i);
                            }
                        }
                        EntradaSaida.exibirMensagem("O time campeão é"+ campeao.getNome());
                    }
                    break;
                case 3:
                    EntradaSaida.exibirMensagem("Obrigada por usar o sitema de simulação de jogos.");

                    break;
                default:
                    EntradaSaida.exibirMensagem("Opção inválida!!");
                    break;
            }
        }
    }
}
