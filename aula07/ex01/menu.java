package aula07.ex01;

import java.util.Scanner;
import java.util.ArrayList;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Forma> formas = new ArrayList<>();
        int opcao = 0;
        do {
            System.out.println("1 - Criar um circulo");
            System.out.println("2 - Criar um retangulo");
            System.out.println("3 - Criar um triangulo");
            System.out.println("4 - Listar formas");
            System.out.println("5 - Comparar formas");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Raio: ");
                    double raio = sc.nextDouble();
                    System.out.print("Cor: ");
                    String cor = sc.next();
                    formas.add(new circle(raio, cor));
                    break;
                case 2:
                    System.out.print("Lado 1: ");
                    double lado1 = sc.nextDouble();
                    System.out.print("Lado 2: ");
                    double lado2 = sc.nextDouble();
                    System.out.print("Cor: ");
                    cor = sc.next();
                    formas.add(new rectangle(lado1, lado2, cor));
                    break;
                case 3:
                    System.out.print("Lado 1: ");
                    lado1 = sc.nextDouble();
                    System.out.print("Lado 2: ");
                    lado2 = sc.nextDouble();
                    System.out.print("Lado 3: ");
                    double lado3 = sc.nextDouble();
                    System.out.print("Cor: ");
                    cor = sc.next();
                    formas.add(new triangle(lado1, lado2, lado3, cor));
                    break;
                case 4:
                    for (Forma forma : formas) {
                        System.out.println(forma);
                    }
                    break;
                case 5:
                    System.out.print("Forma 1: ");
                    int forma1 = sc.nextInt();
                    System.out.print("Forma 2: ");
                    int forma2 = sc.nextInt();
                    if (formas.get(forma1).equals(formas.get(forma2))) {
                        System.out.println("As formas são iguais");
                    } else {
                        System.out.println("As formas são diferentes");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 6);
        sc.close();
    }
}
