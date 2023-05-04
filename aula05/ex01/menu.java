package aula05.ex01;

import java.util.Scanner;

import Utils.DateYMD;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateYMD date = null;
        
        while(true){    
            System.out.println("Date operations:");
            System.out.println("1 - create new date" );
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date" );
            System.out.println("0 - exit");

            System.out.print("Option: ");
            int key = sc.nextInt();

            switch (key) {
                case 1:
                System.out.print("\nyear: ");
                int year = sc.nextInt();
                System.out.print("month: ");
                int month = sc.nextInt();
                System.out.print("day: ");
                int day = sc.nextInt();
                System.out.println();
                date = new DateYMD(year, month, day);

                if (DateYMD.valid(year, month, day)) {
                    break;
                }else{
                    date = null;
                    System.out.println("Date is not valid\n");
                }
                    break;
            
                case 2:
                    if(date == null){
                        System.out.println("\nThere is no created date\n");
                    }else{System.out.println("\n"+date+"\n");}
                    break;
                case 3:
                    if(date == null){
                        System.out.println("\nThere is no created date\n");
                    }else{
                        date.incrementDay();
                        System.out.println();
                    }
                    break;
                case 4:
                    if(date == null){
                        System.out.println("\nThere is no created date\n");
                    }else{date.decrementDay();}
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                
                default:
                    break;
            }
        }
    }
}