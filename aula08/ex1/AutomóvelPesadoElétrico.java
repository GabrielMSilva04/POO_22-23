package aula08.ex1;

public class AutomóvelPesadoElétrico extends AutomóvelPesado implements VeiculoEletrico {
    private int autonomia = 100;

    public AutomóvelPesadoElétrico(String matricula, String marca, String modelo, int cilindrada, int potencia, int nif, int kms) {
        super(matricula, marca, modelo, cilindrada, potencia, nif, kms);
    }

    public int autonomia(){
        return this.autonomia;
    }

    public void carregar(int percentagem){
        if (this.autonomia+percentagem>100) {
            this.autonomia = 100;
        }else{
            this.autonomia += percentagem;
        }
    }

    public String toString(){
        return super.toString() + " - " + autonomia + "%";
    }   
}
