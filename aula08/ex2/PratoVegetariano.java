package aula08.ex2;

public class PratoVegetariano extends Prato {
    public PratoVegetariano(String nome) {
        super(nome);
    }

    @Override
    public boolean addAlimento(Alimento a) {
        if (a.isVegetariano()) {
            super.addAlimento(a);
            return true;
        }else{
            return false;
        }
    }

    public String toString() {
        return super.toString() + " - Prato Vegetariano";
    }
}
