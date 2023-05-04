package aula05.ex02;

import Utils.DateYMD;
import Utils.Utils;

public class Calendar {
    private int[][] events;
    private int year;
    private int firstWeekdayOfYear;


    public Calendar(int year, int firstWeekdayOfYear) {
        this.year = year;
        this.firstWeekdayOfYear = firstWeekdayOfYear;
        events = new int[12][31];
    }

    public int year() {
        return year;
    }

    public int firstWeekdayOfYear() {
        return firstWeekdayOfYear;
    }

    public int firstWeekdayOfMonth(int month) {
        int days = 0;
        for (int i = 1; i < month; i++) {
            days += DateYMD.monthDays(year, i);
        }
        int weekday = (firstWeekdayOfYear + days) % 7;
        return weekday == 0 ? 7 : weekday; //se o resto dividido por 7 for zero, é um domingo
    }


    public void addEvent(DateYMD date){
        int month = date.getMonth();
        int day = date.getDay();

        events[month-1][day-1] = 1;
    }

    public void removeEvent(DateYMD date){
        int month = date.getMonth();
        int day = date.getDay();

        events[month-1][day-1] = 0;
    }

    public String printMonthString(int month){
        int day = 0;
        StringBuilder sb = new StringBuilder();
        String[] names = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int startday = firstWeekdayOfMonth(month);
        String mName = names[month-1];

        sb.append("\n"+Utils.center(mName+" "+year, 27));
        sb.append("\nSun Mon Tue Wen Thu Fri Sat\n");

        // calculate number of spaces before the first day
        int spaces = (startday - 1) * 4;

        // print the first line of the calendar
        for (int i = 1; i <= spaces; i++) {
            sb.append(" ");
        }

        for (int i = 1; i <= 8 - startday; i++) {
            day++;
            sb.append(String.format("%3s ", (events[month-1][day-1] == 1 ? "*" : " ") + i));
        }
        sb.append("\n");
        
        // print the rest of the calendar
        int dayOfWeek = 1;
        for (int i = 9 - startday; i <= DateYMD.monthDays(year, month); i++) {
            day++;
            sb.append(String.format("%3s ", (events[month-1][day-1] == 1 ? "*" : " ") + i));
            
            if (dayOfWeek == 7) {
                sb.append("\n");
                dayOfWeek = 1;
            } else {
                dayOfWeek++;
            }
        }
        sb.append("\n");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            sb.append(printMonthString(i));
            sb.append("\n");
        }
        return sb.toString();
    }
    
}
