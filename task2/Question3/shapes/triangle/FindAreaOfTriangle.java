package Question3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class FindAreaOfTriangle {

    static double baseOfTriangle, heightOfTriangle, area;

    // main method
    public static void main(String[] args) {

        // calling the non-static in a static main method
        FindAreaOfTriangle thisClassObject = new FindAreaOfTriangle();
        thisClassObject.getBaseAndHeightOfTriangle();
        thisClassObject.findArea();
        thisClassObject.outputResults();
    }

    // input the baseOfTriangle and the heightOfTriangle
    void getBaseAndHeightOfTriangle() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("Enter the baseOfTriangle measurement of the triangle: ");
        baseOfTriangle = input.nextDouble(); // store the input in baseOfTriangle
        System.out.println("Enter the heightOfTriangle measurement of the triangle: ");
        heightOfTriangle = input.nextDouble(); // store the input in heightOfTriangle
    }

    // find the area of the rectangle
    void findArea() {
        area = 0.5 * baseOfTriangle * heightOfTriangle;
    }

    // method to output area
    void outputResults() {
        System.out.println("The area is: " + area);
    }

}
