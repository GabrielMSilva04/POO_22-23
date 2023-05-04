package aula08.ex2;

public class Cereal extends Alimento {
    private String nome;
    private boolean vegetariano = true;

    public Cereal(String nome, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String newnome) {
        this.nome = newnome;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }
    
    @Override
    public String toString() {
        return "Cereal " + nome + ", " + super.toString();
    }
}
