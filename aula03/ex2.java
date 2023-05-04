package aula03;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        double mont = lerMontante();
        double juros = lerJuros();
        
        if(mont<=0 || mont%1000!=0){
            System.out.println("Montante introduzido não é válido");
            return;
        }
        for(int i=1 ; i<=12 ; i++){
            mont += mont*(juros/100);
            System.out.println("O valor ao fim de "+i+" meses seria " + mont + " euros");    
        }
    }
    
    public static double lerMontante(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante investido?(Positivo e múltiplo de 1000) ");
        double mont = sc.nextDouble();

        return mont;
    }

    public static double lerJuros(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Taxa de juros mensal?(0-5%) ");
        double juros = sc.nextDouble();
        
        return juros;
    }
}
