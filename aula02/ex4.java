package aula02;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante investido? ");
        double mont = sc.nextDouble();
        System.out.print("Taxa de juros mensal? ");
        double juros = sc.nextDouble();
        sc.close();

        for(int i=0 ; i<3 ; i++){
            mont += mont*(juros/100);
        }
        System.out.println("O valor ao fim de 3 meses seria " + mont + " euros");
    }
}
