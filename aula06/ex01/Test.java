package aula06.ex01;

import Utils.DateYMD;

public class Test {
  public static void main(String[] args)  {
    Aluno al = new Aluno ("Andreia Melo", 9855678, new DateYMD(1990, 7, 18), new DateYMD(2018, 9, 1)); 

    Professor p1 = new Professor("Jorge Almeida", 3467225, new DateYMD(1967, 3, 13), 2, "Informática"); 
    Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new DateYMD(1985, 5, 11), p1, 900); 
    bls.setBolsa(1050); 
       
    System.out.println("Aluno: " + al.getName()); 
    System.out.println(al); 
          
    System.out.println("Bolseiro: " + bls.getName() + ", NMec: "  + bls.getNMec() + ", Bolsa: " +  bls.getBolsa() + ", Orientador: " + bls.getOrientador()); 
    System.out.println(bls); 
  } 
}
