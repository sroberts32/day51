package day51.Arrays.src;

import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter multiple strings. A blank string ends the program. ");

        while (true) {
            String item = scanner.nextLine();

            if (item == "") {
                break;
            } else {
                list.add(item);
            }
        }
        System.out.println("The last item in the list is: " + list.get(list.size() - 1));

        scanner.close();
    }

}