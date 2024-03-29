package aula08.ex2;

public class Legume extends Alimento {
    private String nome;
    private boolean vegetariano = true;

    public Legume(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    @Override
    public String toString() {
        return "Legume " + nome + " " + super.toString();
    }
}
