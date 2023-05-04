package aula08.ex2;

public abstract class Alimento {
    private double proteinas;
    private double calorias;
    private double peso;

    public Alimento(double proteinas, double calorias, double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public double getProteinas() {
        return (proteinas/peso)*100;
    }
    public void setProteinas(int newproteinas) {
        this.proteinas = newproteinas;
    }

    public double getCalorias() {
        return (calorias/peso)*100;
    }
    public void setCalorias(int newcalorias) {
        this.calorias = newcalorias;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(int newpeso) {
        this.peso = newpeso;
    }

    public abstract boolean isVegetariano();

    public String toString() {
        return "Proteínas " + proteinas + ", calorias " + calorias + ", Peso " + peso;
    }
}
