package aula08.ex1;

public class Taxi extends AutomóvelLigeiro {
    private int numeroLicença;

    public Taxi(String matricula, String marca, String modelo, int potencia, int distTotal, int quadroNumero, int capacidadeBagageira, int numeroLicença) {
        super(matricula, marca, modelo, potencia, distTotal, quadroNumero, capacidadeBagageira);
        this.numeroLicença = numeroLicença;
    }

    public int getNumeroLicença() {
        return this.numeroLicença;
    }

    public void setNumeroLicença(int numeroLicença) {
        this.numeroLicença = numeroLicença;
    }

    @Override
    public String toString() {
        return super.toString() + ", número de licença= " + getNumeroLicença();
    }
}