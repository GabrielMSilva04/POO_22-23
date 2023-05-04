package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static String center(String s, int size) {
        return center(s, size, ' ');
    }

    public static String center(String s, int size, char pad) {
        if (s == null || size <= s.length())
            return s;

        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < (size - s.length()) / 2; i++) {
            sb.append(pad);
        }
        sb.append(s);
        while (sb.length() < size) {
            sb.append(pad);
        }
        return sb.toString();
    }
    
    public static int InteiroEntreEspaço(String message, int min, int max){
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print(message);
            if (!sc.hasNextInt()) {
                System.out.println("Inválido. ");
                input = max+1;
                sc.next();
            }else{
                input = sc.nextInt();
            }
        } while (input < min || input > max);

        return input;
    }

    public static double DoubleEntreEspaço(String message, double min, double max){
        Scanner sc = new Scanner(System.in);
        double input;

        do {
            System.out.print(message);
            while (!sc.hasNextDouble()) {
                System.out.print("Inválido. ");
                sc.next();
            }
            input = sc.nextDouble();
        } while (input < min || input > max);

        sc.close();

        return input;
    }

    /**
     * Returns the maximum value in a list of integers.
     */
    public static int max(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Returns the minimum value in a list of integers.
     */
    public static int min(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    /**
     * Returns a new list that contains only the unique elements of the original list.
     */
    public static List<Integer> unique(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i : list) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }
        return uniqueList;
    }
}
