package aula02;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        double v1 = sc.nextDouble();

        double valor = v1;
        double total = v1;
        double valor_maximo = v1;
        double valor_minimo = v1;
        int contador = 1;
        
        while (total == valor || valor != v1) {
            System.out.print("Digite outro número real: ");
            valor = sc.nextDouble();
            if(valor != v1 || contador == 1){
                total += valor;
                contador++;
            }
            if (valor > valor_maximo) {
                valor_maximo = valor;
            }
            if (valor < valor_minimo) {
                valor_minimo = valor;
            }
        }
        sc.close();

        // calcula a média
        double media = total / contador;

        // imprime os resultados
        System.out.println("Valor máximo: " + valor_maximo);
        System.out.println("Valor mínimo: " + valor_minimo);
        System.out.println("Média: " + media);
        System.out.println("Total de números lidos: " + contador);
    }
}
