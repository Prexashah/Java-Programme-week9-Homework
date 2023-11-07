package javaProgrammeWeek_9_Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Programme10_stationsLines {
    public static void main(String[] args) {
        Map<String, String[]> stationLines = new HashMap<>();

        //Which line pass through each station
        stationLines.put("Baker Street", new String[]{"Bakerloo ", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"});
        stationLines.put("Oxford Circus ", new String[]{"Bakerloo", "Central", "Victoria"});
        stationLines.put("Waterloo", new String[]{"Bakerloo",  "Jubilee", "Northern", "Waterloo & City"});


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first station");
        String firstStation = scanner.nextLine();
        System.out.println("Enter the second station");
        String secondStation = scanner.nextLine();

        if (stationLines.containsKey(firstStation) && stationLines.containsKey(secondStation)) {
            String[] firstStationLines = stationLines.get(firstStation);
            String[] secondStationLines = stationLines.get(secondStation);

            //Find common lines between two stations
            for (String line : firstStationLines) {
                for (String otherLine : secondStationLines) {
                    if (line.equalsIgnoreCase(otherLine)) {
                        System.out.println("The " + line + "passes through both " + firstStation + " and " + secondStation + ".");

                    }
                }
            }


        } else {
            System.out.println("One or both of the stations are not in Zone 1.");

        }
        scanner.close();
    }
}
