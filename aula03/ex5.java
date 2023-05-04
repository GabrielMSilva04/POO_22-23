package aula03;

import Utils.Utils;

public class ex5 {
    public static void main(String[] args) {
        int month = Utils.InteiroEntreEspaço("Indica o Mês: ", 1, 12);
        int year = Utils.InteiroEntreEspaço("Indica o Ano: ", 0, Integer.MAX_VALUE);
        int startday = Utils.InteiroEntreEspaço("Indica o Dia da Semana em que começa o mês sendo que 1 é Segunda-Feira e 7 é Domingo: ", 0, 7);
        int maxday = monthDays(month, year);

        String mName = nameMonth(month);
        System.out.println(Utils.center(mName+" "+year, 20));
        System.out.println("Su Mo Tu We Th Fr Sa");

        // calculate number of spaces before the first day
       int spaces = (startday - 1) * 3;

       // print the first line of the calendar
       for (int i = 1; i <= spaces; i++) {
           System.out.print(" ");    
       }
       for (int day = 1; day <= 8 - startday; day++) {
           System.out.printf("%2d ", day);
       }
       System.out.println();
       
       // print the rest of the calendar
       int dayOfWeek = 1;
       for (int day = 9 - startday; day <= maxday; day++) {
           System.out.printf("%2d ", day);
           if (dayOfWeek == 7) {
               System.out.println();
               dayOfWeek = 1;
           } else {
               dayOfWeek++;
           }
        }
       System.out.println();
    }

    public static String nameMonth( int n ){
        String[] names = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        return names[n-1];
    }

    public static boolean anoBissexto( int ano ){
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return true; // é bissexto
        } else {
            return false; // não é bissexto
        }
    }

    public static int monthDays(int m, int y){
        Integer[] month;
        if (anoBissexto(y)){
            month = new Integer[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        } else{
            month = new Integer[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }

        return month[m-1];
    }
}