package aula08.ex2;

import java.util.ArrayList;

public class Ementa {
    public enum DiaSemana {
        SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO, DOMINGO
    }
    private String nome;
    private String local;
    private ArrayList<Prato> pratos;

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.pratos = new ArrayList<Prato>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Prato[] getPratos() {
        return pratos.toArray(new Prato[0]);
    }

    public int getNumPratos() {
        return pratos.size();
    }

    public void addPrato(Prato p, DiaSemana diaSemana) {
        pratos.add(p);
    }

    public boolean removePrato(Prato p) {
        return pratos.remove(p);
    }

    public double getCalorias() {
        double calorias = 0;
        for (Prato p : pratos) {
            calorias += p.getCalorias();
        }
        return calorias;
    }

    public double getPeso() {
        double peso = 0;
        for (Prato p : pratos) {
            peso += p.getPeso();
        }
        return peso;
    }

    public double getProteinas() {
        double proteinas = 0;
        for (Prato p : pratos) {
            proteinas += p.getProteinas();
        }
        return proteinas;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Prato p : pratos) {
            sb.append(p+", dia "+DiaSemana.values()[i]+"\n");
            i++;
        }
        return sb.toString();
    }
}
