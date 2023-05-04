package aula08.ex2;

public class Carne extends Alimento {
    private String variedade;
    public enum VariedadeCarne {
        VACA, PORCO, PERU, FRANGO, OUTRA
    }
    private boolean vegetariano = false;

    public Carne(VariedadeCarne variedade, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.variedade = variedade.toString();
    }

    public String getVariedade() {
        return variedade;
    }

    public void setVariedade(String variedade) {
        this.variedade = variedade;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    @Override
    public String toString() {
        return "Carne " + variedade + " " + super.toString();
    }
}
