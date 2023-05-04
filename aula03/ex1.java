package aula03;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro positvo");
        int n = sc.nextInt();
        sc.close();
        if(n<=0){
            System.out.println("O número "+n+" não é inteiro positivo");
            return;
        }
        serPrimo(n);
    }

    public static boolean serPrimo(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        
        return count == 2 ? true : false;
    }
}
