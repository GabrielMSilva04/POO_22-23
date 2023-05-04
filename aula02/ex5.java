package aula02;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("velocidade 1? ");
        double v1 = sc.nextDouble();
        System.out.print("distância 1? ");
        double d1 = sc.nextDouble();
        System.out.print("velocidade 2? ");
        double v2 = sc.nextDouble();
        System.out.print("distância 1? ");
        double d2 = sc.nextDouble();
        sc.close();
        if(v1>0 && v2>0 && d1>0 && d2>0){
            double vm = (v1*d1+v2*d2) / (d1+d2);
            System.out.println(("A velocidade média foi "+ vm));
        }else{System.out.println("Números negativos inseridos");}
    }
}
