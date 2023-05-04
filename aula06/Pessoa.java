package aula06;

import Utils.DateYMD;

public class Pessoa {
    private String nome; 
    private int cc; 
    private DateYMD dataNasc;

    public Pessoa(String nome, int cc, DateYMD dataNasc) {
        this.nome = nome;
        this.cc = cc;
        this.dataNasc = dataNasc;
    }

    public String getName() {
        return this.nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public int getCc() {
        return this.cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public DateYMD getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(DateYMD dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    @Override
    public String toString() {
        return nome + "; " + "CC: " + cc + "; " + "Data de Nascimento: " + dataNasc;
    }
}
