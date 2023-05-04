package aula08.ex1;

public class AutomóvelPesado extends Veiculo {
    private int quadroNumero;
    private int peso;

    public AutomóvelPesado(String matricula, String marca, String modelo, int potencia, int distTotal, int quadroNumero, int peso) {
        super(matricula, marca, modelo, potencia, distTotal);
        this.quadroNumero = quadroNumero;
        this.peso = peso;
    }

    public int getQuadroNumero() {
        return this.quadroNumero;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() 
        + ", número de quadro= " + getQuadroNumero() 
        + ", peso= " + getPeso();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AutomóvelPesado)) {
            return false;
        }
        AutomóvelPesado automóvelPesado = (AutomóvelPesado) o;
        return quadroNumero == automóvelPesado.quadroNumero && peso == automóvelPesado.peso;
    }
}
