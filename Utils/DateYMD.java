package Utils;

public class DateYMD{
    int year;
    int month;
    int day;

    public DateYMD(int day, int month, int year) {
        set(year, month, day);
    }

    public void set(int year, int month, int day) {
        if (valid(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Invalid date");
        }
    }

    static boolean validMonth(int month){
        if(month>=1 && month<=12){
            return true;
        }
        return false;
    }

    static boolean leapYear(int year){
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

    public static int yearDays(int year){
        return (leapYear(year) ? 366 : 365);
    }

    public static boolean valid(int year, int month, int day){
        if(validMonth(month) && (day>=0 && day <= monthDays(year, month)) && year >= 0){
            return true;
        }
        return false;
    }


    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }
    
    public void incrementDay(){
        if(month == 12 && day == monthDays(year, month) ){
            set(year+1, 1, 1);
        }else if(day == monthDays(year, month)){
            set(year, month+1, 1);
        }else{
            set(year, month, day+1);
        }
    }

    public void decrementDay(){
        if(month == 1 && day == 1){
            set(year-1, 12, monthDays(year-1, 12));
        }else if(day == 1){
            set(year, month-1, monthDays(year, month-1));
        }else{
            set(year, month, day-1);
        }
        System.out.println();
    }


    public String toString() {
        return getYear() + "-" + getMonth() + "-" + getDay();
    }

}