package aula02;

import java.util.Scanner;
import java.lang.Math;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("comprimento do cateto A? ");
        double ca = sc.nextDouble();
        System.out.print("comprimento do cateto B? ");
        double cb = sc.nextDouble();
        sc.close();
        double hip = Math.sqrt(ca*ca+cb*cb);
        if(ca>0 && cb>0){
            System.out.println("Hipotenusa: " + hip);
            System.out.println("Ângulo entre A e a hipótenusa: " + (Math.asin(cb/hip)*180)/Math.PI);
        }else{System.err.println("Comprimento inválido");}
    }
}
