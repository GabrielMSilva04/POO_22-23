package aula07.ex02;

public abstract class Date implements InterDate, Comparable<Date> {
    public abstract int getYear();
    public abstract int getMonth();
    public abstract int getDay();
    public abstract String toString();
    public abstract void set(int year, int month, int day);

    public static int yearDays(int year){
        return (leapYear(year) ? 366 : 365);
    }
    public static boolean validMonth(int month){
        if (month >= 1 && month <= 12) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean valid(int year, int month, int day){
        if(validMonth(month) && (day>=0 && day <= monthDays(year, month)) && year >= 0){
            return true;
        }
        return false;
    }
    public static boolean leapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static int monthDays(int year, int month){
        Integer[] months;
        if (leapYear(year)){
            months = new Integer[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        } else{
            months = new Integer[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        }
        return months[month-1];
    }

    public int compareTo(Date d){
        if(this.getYear() > d.getYear()){
            return 1;
        }else if(this.getYear() < d.getYear()){
            return -1;
        }else{
            if(this.getMonth() > d.getMonth()){
                return 1;
            }else if(this.getMonth() < d.getMonth()){
                return -1;
            }else{
                if(this.getDay() > d.getDay()){
                    return 1;
                }else if(this.getDay() < d.getDay()){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
    }
}

interface InterDate {
    public String toString();
    public void set(int year, int month, int day);
    public int getYear();
    public int getMonth();
    public int getDay();
}
