package aula06.ex01;

import Utils.DateYMD;

public class Bolseiro extends Aluno {
    private Professor orientador;
    private int bolsa;

    public Bolseiro(String nome, int cc, DateYMD dataNasc, Professor orientador, int bolsa) {
        super(nome, cc, dataNasc, null);
        this.orientador = orientador;
        this.bolsa = bolsa;
    }    


    public Professor getOrientador() {
        return this.orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public int getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return super.toString() + "; Orientador: " + orientador.getName() + "; Bolsa: " + bolsa +"€";
    }
}
