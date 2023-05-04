package aula08.ex2;

public class PratoDieta extends Prato {
    private double maxCalorias;

    public PratoDieta(String nome, Double calorias) {
        super(nome);
        this.maxCalorias = calorias;
    }

    @Override
    public boolean addAlimento(Alimento a) {
        if (a.getCalorias() < maxCalorias) {
            super.addAlimento(a);
            return true;
        }else{
            return false;
        }
    }

    public double getMaxCalorias() {
        return maxCalorias;
    }

    public void setMaxCalorias(int maxCalorias) {
        this.maxCalorias = maxCalorias;
    }

    public String toString() {
        return super.toString() + " - Dieta ("+getCalorias()+" Calorias)";
    }
}
