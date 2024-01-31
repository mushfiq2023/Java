package assignment1;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Using the below code we can test out if the sides are legal or illegal
        try {
            while (true) {
                System.out.println("Users Are Encouraged to Enter Valid Sides for Triangle");

                double side1, side2, side3;
                String color;
                boolean filled;

                // Prompt the user to enter the sides of the triangle
                System.out.print("Enter side1 of the triangle: ");
                side1 = input.nextDouble();

                System.out.print("Enter side2 of the triangle: ");
                side2 = input.nextDouble();

                System.out.print("Enter side3 of the triangle: ");
                side3 = input.nextDouble();

                // Check if the entered sides form a valid triangle
                try {
                    TriangleValidityChecks legalTriangle = new TriangleValidityChecks(side1, side2, side3);

                    // If valid sides are entered, proceed to get additional information
                    System.out.print("Enter the color of the triangle: ");
                    color = input.next();

                    System.out.print("Is the triangle filled (true/false)? ");
                    filled = input.nextBoolean();

                    legalTriangle.setColor(color);
                    legalTriangle.setFilled(filled);
                    legalTriangle.getArea();
                    legalTriangle.getPerimeter();
                    System.out.println(legalTriangle);
                    break; // Exit the loop if valid sides are entered
                } catch (TriangleException te) {
                    System.out.println(te.getMessage());
                    System.out.println("Please enter valid sides for the triangle.");
                }
            }

        } finally {
            input.close();
        }
    }
}