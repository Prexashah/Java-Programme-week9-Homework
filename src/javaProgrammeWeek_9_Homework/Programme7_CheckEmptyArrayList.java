package javaProgrammeWeek_9_Homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to test if an array list is empty or not.
 */


public class Programme7_CheckEmptyArrayList {
    public static void main(String[] args) {
        //creating ArrayList
        ArrayList<String> name = new ArrayList<>();
        name.add("Yavi");
        name.add("Maya");
        name.add("Mehul");
        name.add("Rahul");

        //Scanner declaration for taking input from console
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a name or type exit to stop ");
            String name1 = scanner.nextLine();
            if (name1.equalsIgnoreCase("exit")) {
                break;
            }
            name.add(name1);
        }
        if (name.isEmpty()) {
            System.out.println("The Array List is empty ");
        } else {
            System.out.println("The Array list is not empty");
        }
        scanner.close();

    }
}
