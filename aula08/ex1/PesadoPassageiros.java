package aula08.ex1;

public class PesadoPassageiros extends AutomóvelPesado {
    private int passageirosMax;

    public PesadoPassageiros(String matricula, String marca, String modelo, int potencia, int distTotal, int quadroNumero, int peso, int passageirosMax) {
        super(matricula, marca, modelo, potencia, distTotal, quadroNumero, peso);
        this.passageirosMax = passageirosMax;
    }

    public int getPassageirosMax() {
        return this.passageirosMax;
    }

    public void setPassageirosMax(int passageirosMax) {
        this.passageirosMax = passageirosMax;
    }

    @Override
    public String toString() {
        return super.toString() + ", passageiros máximos= " + getPassageirosMax();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PesadoPassageiros)) {
            return false;
        }
        PesadoPassageiros pesadoPassageiros = (PesadoPassageiros) o;
        return passageirosMax == pesadoPassageiros.passageirosMax;
    }
}
