package aula07.ex02;

import java.util.Scanner;

import Utils.DateYMD;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateYMD date1 = null;
        DateND date2 = null;
        
        while (true) {
            System.out.println("1 - DateYMD");
            System.out.println("2 - DateND");
            System.out.println("3 - Exit");
            int op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Insira o dia");
                    int day = sc.nextInt();
                    System.out.println("Insira o mês");
                    int month = sc.nextInt();
                    System.out.println("Insira o ano");
                    int year = sc.nextInt();
                    
                    date1 = new DateYMD(year, month, day);
                    break;
                case 2:
                    System.out.println("Insira o dia");
                    day = sc.nextInt();
                    System.out.println("Insira o mês");
                    month = sc.nextInt();
                    System.out.println("Insira o ano");
                    year = sc.nextInt();

                    date2 = new DateND(year, month, day);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.out.println(date1);
                    System.out.println(date2);
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}