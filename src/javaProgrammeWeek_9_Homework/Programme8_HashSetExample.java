package javaProgrammeWeek_9_Homework;

import java.util.HashSet;
import java.util.Set;

/**Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 else*/

public class Programme8_HashSetExample {
    public static void main(String[] args) {

        Set<Integer> numberSet = new HashSet<>();

        //Store number in to HashSet
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);

        //Check which number from 1 to 10 are in the set
        for (int i = 1; i <=10;i++){
            if ((numberSet.contains(i))){
                System.out.println(i+ " is in the set " );
            }else {
                System.out.println(i+ " is not in the set ");

            }
        }
    }

}
