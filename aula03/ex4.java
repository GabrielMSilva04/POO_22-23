package aula03;

import java.util.Scanner;
import java.lang.Math;

public class ex4 {
    public static int calcularNota(double nt, double np){
        if (nt<7.0 || np<7.0){
            return 66;
        }
        Double nota = nt*0.4 + np*0.6;
        return (int)Math.round(nota);
    }
    
    public static void main(String[] args) {
        int alunos = nAlunos();
        double[][] notas = new double[alunos][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            int numero = i+1;
            System.out.print("Nota teórica do aluno "+ numero +": ");
            notas[i][0] = sc.nextDouble();
            System.out.print("Nota prática do aluno "+ numero +": ");
            notas[i][1] = sc.nextDouble();
        }

        System.out.printf("\n%-5s   %-5s   %-5s\n", "NotaT", "NotaP", "Pauta");
        for (int i = 0; i < notas.length; i++) {
            int NotaF = calcularNota(notas[i][0], notas[i][1]);
            System.out.printf("%5s   %5s   %5s\n", notas[i][0], notas[i][1], NotaF);
        }
    }

    public static int nAlunos(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de alunos na turma: ");
        int alunos = sc.nextInt();

        return alunos;
    }
}
