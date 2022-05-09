package day51.Arrays.src;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5+ strings. An empty string ends the program.");
        System.out.println("An empty string before 5 other strings have been entered breaks it... Don't break it.");

        while (true) {
            String item = scanner.nextLine();

            if (item == "") {
                break;
            } else {
                list.add(item);
            }
        }
        System.out.println("The 5th item in the list is: " + list.get(4));

        scanner.close();
    }

}
