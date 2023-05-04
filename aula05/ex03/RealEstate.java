package aula05.ex03;

import Utils.DateYMD;

public class RealEstate {
    private int id = 1000;
    private Property[] imoveis = new Property[100];

    public void newProperty(String localidade, int quartos, int preco){
        //cria uma nova propriedade
        Property imovel = Property.create(id, quartos, localidade, preco);
        imoveis[id-1000] = imovel;
        imoveis[id-1000].setDisponivel(true);
        id++;
    }

    public void sell(int idparam) {
        if (id>idparam) {
            imoveis[idparam-1000].setDisponivel(false);
            System.out.println("Imóvel "+idparam+" Vendido");
        } else {
            System.out.println("Imóvel "+idparam+" não existe");
        }
    }


    public void setAuction(int idparam, DateYMD date, int duration) {
        if (id>idparam) {
            if (imoveis[idparam-1000].getDisponivel()) {
                imoveis[idparam-1000].setAuction(date, duration);
            }else{
                System.out.println("Imóvel "+idparam+" não está disponível");
            }
        } else {
            System.out.println("Imóvel "+idparam+" não existe");
        }
        
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Propriedades:\n");
        for (Property imovel : imoveis) {
            sb.append(imovel != null ? imovel+"\n" : "");
        }
        return sb.toString();
    }

}
