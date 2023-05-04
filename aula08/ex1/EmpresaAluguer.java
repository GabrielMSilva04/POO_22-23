package aula08.ex1;

import java.util.Objects;

public class EmpresaAluguer {
    private String name;
    private String códigoPostal;
    private String email;
    private Veiculo[] veiculos = new Veiculo[0];
    
    public EmpresaAluguer(String name, String códigoPostal, String email) {
        this.name = name;
        this.códigoPostal = códigoPostal;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCódigoPostal() {
        return this.códigoPostal;
    }

    public void setCódigoPostal(String códigoPostal) {
        this.códigoPostal = códigoPostal;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Veiculo[] getVeiculos() {
        return this.veiculos;
    }

    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

    public void addVeiculo(Veiculo v) {
        Veiculo[] newVeiculos = new Veiculo[this.veiculos.length + 1];
        for (int i = 0; i < this.veiculos.length; i++) {
            newVeiculos[i] = this.veiculos[i];
        }
        newVeiculos[this.veiculos.length] = v;
        this.veiculos = newVeiculos;
    }

    public void removeVeiculo(String matricula) {
        Veiculo[] newVeiculos = new Veiculo[this.veiculos.length - 1];
        int j = 0;
        for (int i = 0; i < this.veiculos.length; i++) {
            if (this.veiculos[i].getMatricula().equals(matricula)) {
                continue;
            }
            newVeiculos[j] = this.veiculos[i];
            j++;
        }
        this.veiculos = newVeiculos;
    }

    public void listVeiculos() {
        for (Veiculo v : this.veiculos) {
            System.out.println(v);
        }
    }

    public Veiculo maiorQuilometros() {
        int km = 0;
        Veiculo veiculo = null;
        for (Veiculo v : this.veiculos) {
            if (v.distanciaTotal() > km) {
                veiculo = v;
                km = v.distanciaTotal();
            }
        }
        return veiculo;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof EmpresaAluguer)) {
            return false;
        }
        EmpresaAluguer empresaAluguer = (EmpresaAluguer) o;
        return Objects.equals(name, empresaAluguer.name) && Objects.equals(códigoPostal, empresaAluguer.códigoPostal) && Objects.equals(email, empresaAluguer.email) && Objects.equals(veiculos, empresaAluguer.veiculos);
    }

}
