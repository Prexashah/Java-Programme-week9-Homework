package javaProgrammeWeek_9_Homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
public class Programme9_creatHashmapObject {
    public static void main(String[] args) {

        //Create a HashMap to store String and Integer values
        Map<String, Integer> people = new HashMap<>();

        //Add data to the map
        people.put("Alice ", 25);
        people.put("John", 30);
        people.put("Charlie", 23);
        people.put("David", 35);

        //Iterate through the values in the map using a for-each loop
        System.out.println("People's age:  ");
        for (int age : people.values()) {
            System.out.println(age);
        }

    }
}