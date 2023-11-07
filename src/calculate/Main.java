package calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner input for reading input foam console
        Scanner scanner = new Scanner(System.in);
        // create an object of calculator class
        Calculator calculator = new Calculator();
        char doMoreCalculation = 'Y';

        while (doMoreCalculation == 'Y' || doMoreCalculation == 'y') {
            System.out.println("Enter first number :");

            int firstNumber = scanner.nextInt();
            System.out.println("Enter second number :");
            int secondNumber = scanner.nextInt();
            System.out.println("Enter any one symbol + , - , * , / :");
            char symbol = scanner.next().charAt(0);

            //method calling from Calculator class
            calculator.calculateResult(firstNumber, secondNumber, symbol);

            System.out.println("Would you like to do more Calculation ? Please enter 'y' or 'n' : ");
            doMoreCalculation = scanner.next().charAt(0);

            //closing the scanner
            scanner.close();
        }
        System.out.println("Programme terminated");

    }
}
