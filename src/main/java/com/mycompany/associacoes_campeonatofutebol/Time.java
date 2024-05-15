package com.mycompany.associacoes_campeonatofutebol;

public class Time {

    private String nome;
    private int numVitorias;
    private int numEmpate;
    private int numDerrota;
    private int golsMarcados;
    private int golsSofridos;
    
    
    public  Time(String nome){
        this.nome = nome;
        this.numVitorias = 0;
        this.numEmpate = 0;
        this.numDerrota = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void addGolsMarcados(int golsMarcados) {
        this.golsMarcados += golsMarcados;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public void addGolsSofridos(int golsSofridos) {
        this.golsSofridos += golsSofridos;
    }

    public int getSaldoGols() {
        return getGolsMarcados() - getGolsSofridos();
    }

    public int getTotalPontos() {
        return 3 * this.getNumVitorias() + this.getNumEmpate();
    }

    public int getNumVitorias() {
        return numVitorias;
    }

    public void addNumVitorias() {
        this.numVitorias++;
    }

    public int getNumEmpate() {
        return numEmpate;
    }

    public void addNumEmpate( ) {
        this.numEmpate++;
    }

    public int getNumDerrota() {
        return numDerrota;
    }

    public void addNumDerrota() {
        this.numDerrota++;
    }
    public int getTotalJogos(){
        return getNumDerrota() + getNumEmpate() + getNumVitorias();
    }
}
