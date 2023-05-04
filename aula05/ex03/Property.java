package aula05.ex03;

import Utils.DateYMD;

public class Property {
    int id;
    int quartos;
    String localidade;
    int preco;
    boolean disponivel;
    boolean auctioned;
    DateYMD date;
    int duration;


    public Property(int id, int quartos, String localidade, int preco) {
        this.id = id++;
        this.quartos = quartos;
        this.localidade = localidade;
        this.preco = preco;
    }

    public static Property create(int id, int quartos, String localidade, int preco){
        return new Property(id, quartos, localidade, preco);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuartos() {
        return this.quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public int getPreco() {
        return this.preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Boolean getDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(Boolean value) {
        this.disponivel = value;
    }

    public void setAuction(DateYMD date, int duration) {
        auctioned = true;
        this.date = date;
        this.duration = duration;
    }

    public DateYMD getEndDate(DateYMD date){
        DateYMD endDate = date;
        for (int i = 1; i <= duration-1; i++) {
            endDate.incrementDay();
        }
        return endDate;
    }

    public String toString() {
        return  "Imóvel: " + getId() +
                "; quartos: " + getQuartos() +
                "; localidade: " + getLocalidade() +
                "; preco: " + getPreco() +
                "; disponivel: " + (getDisponivel() ? "sim" : "não") +
                (auctioned ? "; leilão: " + date +" : "+ getEndDate(date) : "");
    }

}