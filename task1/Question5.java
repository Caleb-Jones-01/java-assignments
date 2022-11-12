package task1;

import java.util.Scanner; //importing Scanner

public class Question5 {

    //method for calculations
    static void calculations(double num1, double num2, char operatorSymbol) {
      
        // variable for my result
        Double result;


        switch (operatorSymbol) {

            //subtraction
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            //addition
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            //multiplication
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            //division
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Please try again.");
                break;
        }
    }

    //main method
    public static void main(String[] args) {

        Scanner data = new Scanner(System.in); // Scanner object

        // request the the operatorSymbol from the user
        System.out.println("Type one of these 4 signs (+, -, *, or /) as your operator: ");
        char operatorSymbol;
        operatorSymbol = data.next().charAt(0);

        // request the first number from the user
        System.out.println("Enter the first number");
        Double num1;
        num1 = data.nextDouble();

        // request the second number from the user
        System.out.println("Enter second number");
        Double num2;
        num2 = data.nextDouble();

        calculations(num1, num2, operatorSymbol);
    }
}