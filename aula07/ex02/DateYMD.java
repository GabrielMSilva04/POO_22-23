package aula07.ex02;

public class DateYMD extends Date{
    int year;
    int month;
    int day;

    public DateYMD(int year, int month, int day) {
        set(year, month, day);
    }

    public void set(int year, int month, int day) {
        if (Date.valid(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid date");
        }
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