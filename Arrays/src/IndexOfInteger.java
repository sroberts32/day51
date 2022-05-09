package day51.Arrays.src;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter multiple numbers. 0 ends the program. ");

        while (true) {
            int item = Integer.valueOf(scanner.nextLine());

            if (item == 0) {
                break;
            } else {
                list.add(item);
            }
        }
        System.out.println("Done entering integers into the list.");
        System.out.println("What number are you looking for in the list?");

        int value = Integer.valueOf(scanner.nextLine());

        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) == value) {
                System.out.println(value + " is at index " + index);
            }
        }

        scanner.close();
    }

}
