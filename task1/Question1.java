package task1;

//importing Scanner 
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        // my scanner object
        Scanner input = new Scanner(System.in);
        
        //My variables for storing string data type
        String srName, oddEven;
        //My variables for storing integer data type
        int age, numberOfChar;
        
        //Getting inputs
        System.out.println("Please enter your sir name :");
        srName = input.nextLine(); //getting name
        System.out.println("PLease enter your age :");
        age = input.nextInt(); //getting age

        //getting the number of letters in the sir name
        numberOfChar = srName.length();
        //if age is even or odd
        if (age % 2 == 0) {
            oddEven = "even";
        } else {
            oddEven = "odd";
        }
        
        //Display output
        System.out.println("The number of characters in your sir name is : " + numberOfChar);
        System.out.println("Your current age is an " + oddEven + " number.");
    }
}