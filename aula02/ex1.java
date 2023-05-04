package aula02;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("km?");
        double km = sc.nextDouble();
        double miles = km / 1.609;
        System.out.println("miles:" + miles);
        sc.close();
    }
}
