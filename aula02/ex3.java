package aula02;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de água?(kg) ");
        double quant = sc.nextDouble();
        System.out.print("Temperatura inicial(C)? ");
        double iT = sc.nextDouble();
        System.out.print("Temperatura final(C)? ");
        double fT = sc.nextDouble();
        double e = quant * (fT-iT)*4184;
        System.out.println("A energia necessária é" + e + "J");
        sc.close();
    }
}
