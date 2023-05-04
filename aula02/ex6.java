package aula02;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tempo em segundos: ");
        int t = sc.nextInt();
        sc.close();
        int h = t/3600;
        int m = (t%3600)/60;
        int s = t%60;
        System.out.println(h+":"+m+":"+s);
    }
}
