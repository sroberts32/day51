package day51.Arrays.src;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
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

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        int total = 0;
        for (int t : list) {
            total += t;
        }

        System.out.print("Were the items in the list. The sum of that list is: " + total);
        scanner.close();

    }
}
