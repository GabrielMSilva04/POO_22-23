package aula06.ex01;

import Utils.DateYMD;
import aula06.Pessoa;

public class Professor extends Pessoa {
    private int code;
    private String departamento;

    public Professor(String nome, int cc, DateYMD dataNasc, int code, String departamento) {
        super(nome, cc, dataNasc);
        this.code = code;
        this.departamento = departamento;
    }

    private int getCode(){
        return code;
    }

    private void setCode(int code){
        this.code = code;
    }


    public void setAuxiliar(){
        setCode(1);
    }
    public void setAssociado(){
        setCode(2);
    }
    public void setCatedratico(){
        setCode(3);
    }


    public boolean isAuxiliar(){
        return getCode()==1;
    }
    public boolean isAssociado(){
        return getCode()==2;
    }
    public boolean isCatedratico(){
        return getCode()==3;
    }


    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        return super.toString() + "; Categoria: " + (isAuxiliar() ? "Auxiliar" : isAssociado() ? "Associado" : "Catedrático");
    }
}
