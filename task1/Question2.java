package task1;

import java.util.Scanner; //importing Scanner

public class Question2 {

    // main function
    public static void main(String[] args) {

        // my scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks of the units you did on last semester.");

        // getting the units as entered at the console
        System.out.println("Unit 1: ");
        double unit_1;
        unit_1 = input.nextDouble();
        System.out.println("Unit 2: ");
        double unit_2;
        unit_2 = input.nextDouble();
        System.out.println("Unit 3: ");
        double unit_3;
        unit_3 = input.nextDouble();
        System.out.println("Unit 4: ");
        double unit_4;
        unit_4 = input.nextDouble();
        System.out.println("Unit 5: ");
        double unit_5;
        unit_5 = input.nextDouble();

        // getting average mark by calling the getTheAverage method,
        // assigning it using left to right operation
        double average = getTheAverage(unit_1, unit_2, unit_3, unit_4, unit_5);

        // Display the average
        System.out.println("\nYou average mark: " + average);
    }

    // this method returns the rounded average by taking 5 args
    static double getTheAverage(double num1, double num2, double num3, double num4, double num5) {
        // finding the average
        var originalAverage = (num1 + num2 + num3 + num4 + num5) / 5;
        // rounding the average
        var roundedAverage = Math.round(originalAverage * 100.0) / 100.0;
        // This is the return value
        return roundedAverage;
    }
}
