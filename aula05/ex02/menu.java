package aula05.ex02;

import java.util.Scanner;

import Utils.DateYMD;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar calendar = null;
        
        while(true){    
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - add new event");
            System.out.println("3 - remove event");
            System.out.println("4 - print calendar month");
            System.out.println("5 - print calendar");
            System.out.println("0 - exit");

            System.out.print("Option: ");
            int key = sc.nextInt();

            switch (key) {
                case 1:
                    System.out.print("\nEnter year: ");
                    int year = sc.nextInt();
                    System.out.print("Enter first weekday of year (1-7): ");
                    int firstWeekday = sc.nextInt();
                    calendar = new Calendar(year, firstWeekday);
                    System.out.println("\nCalendar created.\n");
                    break;

                case 2:
                    System.out.println();
                    if (calendar == null) {
                        System.out.println("Calendar not created yet.\n");
                    } else {
                        System.out.print("Enter month: ");
                        int month = sc.nextInt();
                        System.out.print("Enter day (1-"+DateYMD.monthDays(calendar.year(), month)+"): ");
                        int day = sc.nextInt();
                        DateYMD eventDate = new DateYMD(calendar.year(), month, day);
                        calendar.addEvent(eventDate);
                        System.out.println("\nEvent added.\n");
                    }
                    break;

                case 3:
                    System.out.println();
                    if (calendar == null) {
                        System.out.println("Calendar not created yet.\n");
                    } else {
                        System.out.print("Enter month: ");
                        int month = sc.nextInt();
                        System.out.print("Enter day (1-"+DateYMD.monthDays(calendar.year(), month)+"): ");
                        int day = sc.nextInt();
                        DateYMD eventDate = new DateYMD(calendar.year(), month, day);
                        calendar.removeEvent(eventDate);
                        System.out.println("\nEvent removed.\n");
                    }
                    break;
                case 4:
                    System.out.println();
                    if (calendar == null) {
                        System.out.println("Calendar not created yet.\n");
                    } else {
                        System.out.print("Enter month (1-12): ");
                        int month = sc.nextInt();
                        System.out.println(calendar.printMonthString(month));
                    }
                    break;

                case 5:
                    if (calendar == null) {
                        System.out.println("Calendar not created yet.");
                    } else {
                        System.out.println(calendar.toString());
                    }
                    break;

                case 0:
                    sc.close();
                    System.exit(0);
                
                default:
                    System.out.println("Invalid option.\n");
                    break;
            }
        }
    } 
}
