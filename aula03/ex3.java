package aula03;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        String resposta = "Sim";
        Scanner sc = new Scanner(System.in);
        while(resposta.equals("Sim") || resposta.equals("S") || resposta.equals("s")){
            int n = random(100);
            int tries = game(n);
            System.out.println("Número de tentativas: "+tries);
            System.out.println("Parabéns");
            System.out.print("Pretende continuar? Prima (S)im ");
            resposta = sc.next();
        }
    }

    public static int random(int max) { //random number 0-max
        Random rand = new Random();
        int n = rand.nextInt(max);
        return n+1;
    }

    public static int game(int number) {
        int tentativas = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Tente adivinhar o número (1-100): ");
            tentativas++;
            int guess = sc.nextInt();
            if(guess == number){
                return tentativas;
            }else if(guess < number){
                System.out.println("DEMASIADO BAIXO");
            }else{
                System.out.println("DEMASIADO ALTO");
            }
        }
    }
}
