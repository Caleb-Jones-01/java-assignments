package Question3.leapyear;

import java.util.Scanner;

public class GetLeapYear {

    // main method
    public static void main(String[] args) {

        // calling method
        getLeapYear();
    }

    // the method to find leap year
    static void getLeapYear() {

        // variable to store year
        int year;
        // scanner object
        Scanner input = new Scanner(System.in);

        // input the year
        System.out.println("Enter year :");
        year = input.nextInt();

        
        if ((year % 4) == 0) {
            // it is a leap year
            System.out.println(year + " is a leap year");
        } else {
            // it is not a leap year
            System.out.println(year + " is not a leap year");
        }

    }

    
}
