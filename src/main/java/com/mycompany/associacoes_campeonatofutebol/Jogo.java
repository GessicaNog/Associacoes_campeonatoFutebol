package com.mycompany.associacoes_campeonatofutebol;

import java.util.Random;

public class Jogo {

    public Time time1;
    private Time time2;

    public Jogo(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public Time getTime1() {
        return time1;
    }

    public Time getTime2() {
        return time2;
    }

    public void simularJogo() {
        int golTime1 = getGols();
        int golTime2 = getGols();
        time1.addGolsMarcados(golTime1);
        time1.addGolsSofridos(golTime2);
        time2.addGolsMarcados(golTime2);
        time2.addGolsSofridos(golTime1);
        if (golTime1 > golTime2) {
            time1.addNumVitorias();
            time2.addNumDerrota();
        } else if (golTime1 < golTime2) {
            time1.addNumDerrota();
            time2.addNumVitorias();
        } else {
            time1.addNumEmpate();
            time2.addNumEmpate();
        }
        EntradaSaida.exibirMensagem(time1.getNome() + " " + golTime1 + " X " + golTime2 + " " + time2.getNome());
    }

    private int getGols() {
        Random random = new Random();

        return random.nextInt(10);//return 0..9
    }
}
