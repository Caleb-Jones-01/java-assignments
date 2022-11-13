package Question1.methods_in_java.methods;

import java.util.Scanner; //Scanner import

public class Methods {

    // main method
    public static void main(String[] args) {

        // a list of my variables
        double num1, num2, num3, num4, num5;

        // scanner object
        Scanner input = new Scanner(System.in);

        // getting input
        System.out.println("\nEnter the first number: ");
        num1 = input.nextInt(); // input first number
        System.out.println("Enter the second number: ");
        num2 = input.nextInt(); // input second number
        System.out.println("Enter the third number: ");
        num3 = input.nextInt(); // input third number

        // get return values fom the methods
        num4 = smallNumber(num1, num2, num3);
        num5 = largeNumber(num1, num2, num3);

        // output
        System.out.println("\nThe smallest number: " + num4);
        System.out.println("The largest number: " + num5);
        System.out.println(num5 + " is your largest and " + num4 + " is the smallest number.");
    }

    // this static method will find the smallest num
    static double smallNumber(double num_1, double num_2, double num_3) {

        if (num_1 < num_2) {
            // if true, is num_1 > num_3
            if (num_1 < num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            // else false, is num_2 < num_3
            if (num_2 < num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

    // this static method will find the largest num
    static double largeNumber(double num_1, double num_2, double num_3) {

        // get largest number
        if (num_1 > num_2) {
            if (num_1 > num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            if (num_2 > num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

}
