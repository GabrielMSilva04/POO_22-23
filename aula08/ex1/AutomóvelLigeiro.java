package aula08.ex1;

public class AutomóvelLigeiro extends Veiculo {
    private int quadroNumero;
    private int capacidadeBagageira;

    public AutomóvelLigeiro(String matricula, String marca, String modelo, int potencia, int distTotal, int quadroNumero, int capacidadeBagageira) {
        super(matricula, marca, modelo, potencia, distTotal);
        this.quadroNumero = quadroNumero;
        this.capacidadeBagageira = capacidadeBagageira;
    }

    public int getQuadroNumero() {
        return this.quadroNumero;
    }

    public int getCapacidadeBagageira() {
        return this.capacidadeBagageira;
    }

    public void setCapacidadeBagageira(int capacidadeBagageira) {
        this.capacidadeBagageira = capacidadeBagageira;
    }

    @Override
    public String toString() {
        return super.toString() 
        + ", número de quadro= " + getQuadroNumero() 
        + ", capacidade da bagageira= " + getCapacidadeBagageira();
    }  
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AutomóvelLigeiro)) {
            return false;
        }
        AutomóvelLigeiro automóvelLigeiro = (AutomóvelLigeiro) o;
        return quadroNumero == automóvelLigeiro.quadroNumero && capacidadeBagageira == automóvelLigeiro.capacidadeBagageira;
    }

}
