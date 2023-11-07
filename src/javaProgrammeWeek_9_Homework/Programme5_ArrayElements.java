package javaProgrammeWeek_9_Homework;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterate
 */

public class Programme5_ArrayElements {
    public static void main(String[] args) {

        // create Array list
        ArrayList<String> language = new ArrayList<>();
        language.add("JAVA");
        language.add("C++");
        language.add("python");
        language.add("Sql");

        //using  list iterator to get the result
        System.out.println("Using itrator");
        ListIterator<String> iterate = language.listIterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());


        }
    }


}
