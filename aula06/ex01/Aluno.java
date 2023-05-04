package aula06.ex01;

import Utils.DateYMD;
import aula06.Pessoa;

public class Aluno extends Pessoa {
    private DateYMD dataInsc;
    private static int last_nMec = 100;
    private int nMec;


    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc) {
        super(nome, cc, dataNasc);
        this.dataInsc = dataInsc;
        last_nMec++;
        this.nMec = last_nMec;
    }


    public DateYMD getDataInsc() {
        return this.dataInsc;
    }


    public int getNMec() {
        return this.nMec;
    }
    
    public String toString() {
        return super.toString() + "; nMec: " + this.nMec;
    }
}
