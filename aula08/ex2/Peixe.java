package aula08.ex2;

public class Peixe extends Alimento {
    private String tipo;
    public enum TipoPeixe {
        CONGELADO, FRESCO
    }
    private boolean vegetariano = false;

    public Peixe(TipoPeixe tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo.toString();
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String newtipo) {
        this.tipo = newtipo;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    @Override
    public String toString() {
        return "Peixe " + tipo + " " + super.toString();
    }
}
