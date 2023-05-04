package aula04.ex1;

import java.util.Scanner;
import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        ArrayList<Object> circulos = new ArrayList<>();
        ArrayList<Object> triangulos = new ArrayList<>();
        ArrayList<Object> retangulos = new ArrayList<>();
        do {

            System.out.println("MENU");
            System.out.println("1. Criar círculo");
            System.out.println("2. Criar triãngulo");
            System.out.println("3. Criar retângulo");
            System.out.println("4. Listagem");
            System.out.println("0. EXIT");
            System.out.print("Option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Insira o raio do círculo: ");
                    Double raio = sc.nextDouble();
                    circle c = new circle(raio);
                    circulos.add(c);
                    break;
                    
                case 2:
                    System.out.print("Insira o comprimento do lado 1: ");
                    Double l1 = sc.nextDouble();
                    System.out.print("Insira o comprimento do lado 2: ");
                    Double l2 = sc.nextDouble();
                    System.out.print("Insira o comprimento do lado 3: ");
                    Double l3 = sc.nextDouble();
                    triangle t = new triangle(l1, l2, l3);
                    triangulos.add(t);
                    break;

                case 3:
                    System.out.print("Insira o comprimento: ");
                    Double comp = sc.nextDouble();
                    System.out.print("Insira altura: ");
                    Double alt = sc.nextDouble();
                    rectangle r = new rectangle(comp, alt);
                    retangulos.add(r);
                    break;
                    
                case 4:
                    for (int i = 0; i < circulos.size(); i++) {
                        System.out.println("\n"+circulos.get(i));
                    }
                    for (int i = 0; i < triangulos.size(); i++) {
                        System.out.println("\n"+triangulos.get(i));
                    }
                    for (int i = 0; i < retangulos.size(); i++) {
                        System.out.println("\n"+retangulos.get(i));
                    }
                    System.out.println();
                    
                    if (circulos.size() >= 2) {
                        for (int i = 0; i < circulos.size(); i++) {
                            for (int i2 = 0; i2 < circulos.size(); i2++) {
                                if(i2>i){
                                    System.out.println("Círculo "+(i+1)+" e Círculo "+(i2+1)+": "+circulos.get(i).equals(circulos.get(i2)));
                                }
                            }
                        }
                    }
                    if (triangulos.size() >= 2) {
                        for (int i = 0; i < triangulos.size(); i++) {
                            for (int i2 = 0; i2 < triangulos.size(); i2++) {
                                if(i2>i){
                                    System.out.println("Triângulo "+(i+1)+" e Triângulo "+(i2+1)+": "+triangulos.get(i).equals(triangulos.get(i2)));
                                }
                            }
                        }
                    }
                    if (retangulos.size() >= 2) {
                        for (int i = 0; i < retangulos.size(); i++) {
                            for (int i2 = 0; i2 < retangulos.size(); i2++) {
                                if(i2>i){
                                    System.out.println("Retângulo "+(i+1)+" e Retângulo "+(i2+1)+": "+retangulos.get(i).equals(retangulos.get(i2)));
                                }
                            }
                        }
                    }
                    System.out.println();
                    break;
                    
                case 0:
                    return;
            
                default:
                    break;
            }
        }while(option != 0);

        sc.close();
    }
}
