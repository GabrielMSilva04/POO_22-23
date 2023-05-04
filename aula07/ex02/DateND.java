package aula07.ex02;

public class DateND extends Date {
    int daysNumber;

    public DateND(int year, int month, int day) {
        set(year, month, day);
    }

    private void setDaysNumber(int daysNumber) {
        this.daysNumber = daysNumber;
    }

    public int getDaysNumber() {
        return daysNumber;
    }

    public void set(int year, int month, int day) {
        if (valid(year, month, day) && year>=2000) {
            for (int i = 0; i < year - 2000; i++) {
                daysNumber += Date.yearDays(2000 + i);
            }
            for (int i = 1; i < month; i++) {
                daysNumber += Date.monthDays(2000, i);
            }
            daysNumber += day-1;
            setDaysNumber(daysNumber);
        } else {
            System.out.println("Invalid date");
        }
    }


    public int getYear() {
        int year = 2000;
        int days = getDaysNumber();
        while (days>=Date.yearDays(year)) {
            days -= Date.yearDays(year);
            year++;
        }
        return year;
    }

    public int getMonth() {
        int month = 1;
        int year = 2000;
        int days = getDaysNumber();
        while (days>=Date.monthDays(year, month)) {
            days -= Date.monthDays(year, month);
            month++;
            if (month==13) {
                month=1;
                year++;
            }
        }
        return month;

    }

    public int getDay() {
        int day = 0;
        int month = 1;
        int year = 2000;
        int days = getDaysNumber();
        while (days>=Date.monthDays(year, month)) {
            days -= Date.monthDays(year, month);
            month++;
            if (month==13) {
                month=1;
                year++;
            }
        }
        day += days;
        return day;
    }

    public String toString() {
        return getYear() + "-" + getMonth() + "-" + getDay();
    }
}
