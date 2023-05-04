package aula08.ex1;

public class PesadoMercadorias extends AutomóvelPesado {
    private int cargaMax;

    public PesadoMercadorias(String matricula, String marca, String modelo, int potencia, int distTotal, int quadroNumero, int peso, int cargaMax) {
        super(matricula, marca, modelo, potencia, distTotal, quadroNumero, peso);
        this.cargaMax = cargaMax;
    }

    public int getCargaMax() {
        return this.cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", carga máxima= " + getCargaMax();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PesadoMercadorias)) {
            return false;
        }
        PesadoMercadorias pesadoMercadorias = (PesadoMercadorias) o;
        return cargaMax == pesadoMercadorias.cargaMax;
    }
}
