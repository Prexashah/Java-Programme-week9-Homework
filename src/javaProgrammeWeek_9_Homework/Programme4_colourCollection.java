package javaProgrammeWeek_9_Homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */

public class Programme4_colourCollection {
    public static void main(String[] args) {
        List<String> colourList = new ArrayList<>();
        //Adding colours to the arrayList

        colourList.add("Red");
        colourList.add("Green");
        colourList.add("Blue");
        colourList.add("Yellow");
        colourList.add("Orange");

        //Printing the collection using a for-each loop
        System.out.println("Colours in the ArrayList");
        for (String colour : colourList) {
            System.out.println(colour);
        }

    }

}