import java.util.*;
public class Main{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your length : ");
        double length = getUserInput();
        System.out.print("Enter your width : ");
        double width = getUserInput();
        System.out.println("Calculates both the perimeter and the area of a rectangle.");
        String type = "area";
        double resultOfArea = calculate(length, width, type);
        displayResult(type, resultOfArea);
        type = "perimeter";
        double resultOfPerimeter = calculate(length, width, type);
        displayResult(type, resultOfPerimeter);
        input.close();
    }

    // input 
    public static double getUserInput() {
        double value = input.nextDouble();

        while (value<0) {
            System.out.println("Invalid input. Negative value not allowed! Please enter again.");
            value = input.nextDouble();
        }
        return value;
    }

    // calculating result for Area and Perimeter.
    public static double calculate(double length, double width, String type) {
        if (type.equalsIgnoreCase("area")) {
            return length * width;
        } else if (type.equalsIgnoreCase("perimeter")) {
            return 2 * (length + width);
        } else {
            throw new IllegalArgumentException("Invalid calculation type. Use 'area' or 'perimeter'.");
        }
    }

    // display results
    public static void displayResult(String type, double result) {
        System.out.printf("The %s is: %.2f%n", type, result);
    }
}