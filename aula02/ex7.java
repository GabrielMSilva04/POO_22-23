package aula02;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("coord x do ponto 1? ");
        double x1 = sc.nextDouble();
        System.out.print("coord y do ponto 1? ");
        double y1 = sc.nextDouble();
        System.out.print("coord x do ponto 2? ");
        double x2 = sc.nextDouble();
        System.out.print("coord y do ponto 2? ");
        double y2 = sc.nextDouble();
        sc.close();
        System.out.println("Distância entre os pontos: "+ Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)));
    }
}
