package javaProgrammeWeek_9_Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Programme6_RetrieveElement {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);

        //Adding fruits to the ArrayLists
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Blue berry");
        fruits.add("Cherry");
        fruits.add("Kiwi");

        //Ask user to enter the index
        System.out.println("Enter the index to retrieve an elements: ");
        int indexToRetrieve = scanner.nextInt();

        if (indexToRetrieve >= 0 && indexToRetrieve < fruits.size()) {
            String elements = fruits.get(indexToRetrieve);

            System.out.println("Element at index" + indexToRetrieve + ":" + elements);
        } else {
            System.out.println("Index out of bounds. ");
        }

        scanner.close();

    }

}
