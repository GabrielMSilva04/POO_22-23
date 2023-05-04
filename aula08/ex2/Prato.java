package aula08.ex2;
import java.util.ArrayList;

public class Prato {
    private String nome;
    private ArrayList<Alimento> alimentos;

    public Prato(String nome) {
        this.nome = nome;
        this.alimentos = new ArrayList<Alimento>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String newnome) {
        this.nome = newnome;
    }

    public Alimento[] getAlimentos() {
        return alimentos.toArray(new Alimento[0]);
    }
    

    public int getNumAlimentos() {
        return alimentos.size();
    }

    public boolean addAlimento(Alimento a) {
        alimentos.add(a);
        return true;
    }

    public boolean removeAlimento(Alimento a) {
        return alimentos.remove(a);
    }

    public double getCalorias() {
        double calorias = 0;
        for (Alimento a : alimentos) {
            calorias += a.getCalorias();
        }
        return (double) Math.round(calorias*100)/100;
    }

    public double getPeso() {
        double peso = 0;
        for (Alimento a : alimentos) {
            peso += a.getPeso();
        }
        return peso;
    }

    public double getProteinas() {
        double proteinas = 0;
        for (Alimento a : alimentos) {
            proteinas += a.getProteinas();
        }
        return (double) Math.round(proteinas*100)/100;
    }

    public boolean isVegetariano() {
        for (Alimento a : alimentos) {
            if (!a.isVegetariano()) {
                return false;
            }
        }
        return true;
    }

    public void listAlimentos() {
        for (Alimento a : alimentos) {
            System.out.println(a);
        }
    }

    public String toString() {
        return "Prato " + "'" + nome + "', composto por " + getNumAlimentos() + " Ingredientes";
    }
}
