package com.mycompany.associacoes_campeonatofutebol;

import java.util.ArrayList;

public class Campeonato {

    ArrayList<Time> times = new ArrayList<>();
    ArrayList<Jogo> jogos = new ArrayList<>();

    public Campeonato() {

    }

    public void imprimirTabela() {
        System.out.printf("%5s %5s %5s %5s %5s %5s %5s %5s %5s", "Nome do time",
                "Total de Jogos", "Vitórias", "Empates", "Derrotas",
                "Total de Pontos", "Gols Marcados", "Gols Sofridos", "Saldo de Gols");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < times.size(); i++) {
            Time t = times.get(i);
            System.out.printf("%10s %10d %10d %10d %10d %10d %10d %10d %10d", t.getNome(),t.getTotalJogos(),t.getNumVitorias(),
                    t.getNumEmpate(),t.getNumDerrota(),t.getTotalPontos(),t.getGolsMarcados(),t.getGolsSofridos(),
                    t.getSaldoGols());
            System.out.println();
            
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
    }

}
