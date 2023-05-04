package aula02;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius? ");
        double c = sc.nextDouble();
        double f = 1.8*c+32;
        System.out.println("A temperatura em graus Fahrenheit é " + f);
        sc.close();
    }
}
