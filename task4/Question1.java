import java.util.Arrays; //importing  Arrays
import java.util.Scanner; // importing the  Scanner

class Question1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // my array
        int[] mArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        // request data input to the array
        System.out.println("\nEnter 15 numbers to our array: ");
        // store 1st position to the 15th position
        mArray[0] = input.nextInt();
        mArray[1] = input.nextInt();
        mArray[2] = input.nextInt();
        mArray[3] = input.nextInt();
        mArray[4] = input.nextInt();
        mArray[5] = input.nextInt();
        mArray[6] = input.nextInt();
        mArray[7] = input.nextInt();
        mArray[8] = input.nextInt();
        mArray[9] = input.nextInt();
        mArray[10] = input.nextInt();
        mArray[11] = input.nextInt();
        mArray[12] = input.nextInt();
        mArray[13] = input.nextInt();
        mArray[14] = input.nextInt();

        // converting the array to a string list.
        var myList = Arrays.toString(mArray);

        // output the array as a list
        System.out.println("Our array has the following values: " + myList);

        System.out.println("Enter a random number to check if it is in the array: ");
        var numInput = input.nextInt();

        check(mArray, numInput);

    }

    private static void check(int[] arr, int valueToCheck) {

        
        boolean test = false;
        for (int num : arr) {// implore Linear Search as a method

            // check if the specified num
            // is present in the array or not
            if (num == valueToCheck) {
                test = true;
                break;
            }

        }

        // output the result
        if (test) {
            System.out.println(valueToCheck + " is in the array.");
        } else {
            System.out.println(valueToCheck + " is not in the array.");
        }

    }
}