
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the sides of the triangle
        System.out.print("Enter side1 of the triangle: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2 of the triangle: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side3 of the triangle: ");
        double side3 = input.nextDouble();

        // Prompt the user for the color and whether the triangle is filled
        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true/false)? ");
        boolean filled = input.nextBoolean();


        Triangle triangle = new Triangle(side1, side2 , side3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        triangle.getArea();
        triangle.getPerimeter();



        // Display the details of the triangle using the toString method
        System.out.println(triangle);



    }
}
