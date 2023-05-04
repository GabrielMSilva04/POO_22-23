package aula08.ex1;

import java.util.Objects;

public class Veiculo implements KmPercorridosInterface {
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int distPercorrida = 0;
    private int distTotal;


    public Veiculo(String matricula, String marca, String modelo, int potencia, int distTotal) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.distTotal = distTotal;
    }


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setDistTotal(int distTotal) {
        this.distTotal = distTotal;
    }


    public void trajeto(int quilometros){
        distPercorrida = quilometros;
        distTotal += distPercorrida;
    }

    
    public int ultimoTrajeto() {
        return distPercorrida;
    }

    
    public int distanciaTotal() {
        return distTotal;
    }


    @Override
    public String toString() {
        return
            " matricula= " + getMatricula() +
            ", marca= " + getMarca() +
            ", modelo= " + getModelo() +
            ", potencia= " + getPotencia() +
            ", distPercorrida= " + ultimoTrajeto() +
            ", distTotal= " + distanciaTotal();
    }
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Veiculo)) {
            return false;
        }
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(matricula, veiculo.matricula) && Objects.equals(marca, veiculo.marca) && Objects.equals(modelo, veiculo.modelo) && potencia == veiculo.potencia && distPercorrida == veiculo.distPercorrida && distTotal == veiculo.distTotal;
    }
}
