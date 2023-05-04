package aula02;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N? ");
        int n = sc.nextInt();
        sc.close();
        for(int i = n; i>=0; i--){
            System.out.print(i);
            if(i%10==1){
                System.out.println();
            }else{System.out.print(",");}
        }
    }
}
