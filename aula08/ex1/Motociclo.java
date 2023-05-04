package aula08.ex1;

public class Motociclo extends Veiculo {
    private String tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, int distTotal, String tipo) {
        super(matricula, marca, modelo, potencia, distTotal);
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipo= " + getTipo();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Motociclo)) {
            return false;
        }
        Motociclo motociclo = (Motociclo) o;
        return tipo.equals(motociclo.tipo);
    }
}
