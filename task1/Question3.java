package task1;

import java.util.Scanner; //Sannner import

public class Question3 {
    
    //this method does the test for 0
    static void testingDiv0(int numToCheck) {
        System.out.println(numToCheck + " can't be divisible by 0 since zero does'nt present existence.");
    }

    //this method does the test for 1
    static void testingDiv1(int numToCheck) {
        System.out.println(numToCheck + " is divisible by 1.");
    }

    //this method does the test for 2
    static void testingDiv2(int numToCheck) {
        if (numToCheck % 2 == 0) {
            System.out.println(numToCheck + " is divisible by 2.");
        } else {
            System.out.println(numToCheck + " is not divisible by 2.");
        }
    }

    //this method does the test for 3
    static void testingDiv3(int numToCheck) {
        if ((numToCheck % 3) == 0) {
            System.out.println(numToCheck + " is divisible by 3");
        } else {
            System.out.println(numToCheck + " is not divisible by 3");
        }
    }

    //this method does the test for 4
    static void testingDiv4(int numToCheck) {
        if ((numToCheck % 4) == 0) {
            System.out.println(numToCheck + " is divisible by 4");
        } else {
            System.out.println(numToCheck + " is not divisible by 4");
        }
    }

    //this method does the test for 5
    static void testingDiv5(int numToCheck) {
    if ((numToCheck % 5) == 0) {
            System.out.println(numToCheck + " is divisible by 5");
        } else {
            System.out.println(numToCheck + " is not divisible by 5");
        }
    }

    //this method does the test for 6
    static void testingDiv6(int numToCheck) {
        if ((numToCheck % 6) == 0) {
            System.out.println(numToCheck + " is divisible by 6");
        } else {
            System.out.println(numToCheck + " is not divisible by 6");
        }
    }

    //this method does the test for 7
    static void testingDiv7(int numToCheck) {
        if ((numToCheck % 7) == 0) {
            System.out.println(numToCheck + " is divisible by 7");
        } else {
            System.out.println(numToCheck + " is not divisible by 7");
        }
    }

    //this method does the test for 8
    static void testingDiv8(int numToCheck) {
        if ((numToCheck % 8) == 0) {
            System.out.println(numToCheck + " is divisible by 8");
        } else {
            System.out.println(numToCheck + " is not divisible by 8");
        }
    }

    //this method does the test for 9
    static void testingDiv9(int numToCheck) {
        if ((numToCheck % 9) == 0) {
            System.out.println(numToCheck + " is divisible by 9");
        } else {
            System.out.println(numToCheck + " is not divisible by 9");
        }
    }


    //the main method
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);


        int num;
        //getting input
        System.out.println("This program checks if numbers are divisibile by zero to 9. Enter any number :");        
        num = input.nextInt();

        //calling the methods shown above
        testingDiv0(num);
        testingDiv1(num);
        testingDiv2(num);
        testingDiv3(num);
        testingDiv4(num);
        testingDiv5(num);
        testingDiv6(num);
        testingDiv7(num);
        testingDiv8(num);
        testingDiv9(num);
    }

}
