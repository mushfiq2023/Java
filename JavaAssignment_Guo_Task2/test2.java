import java.sql.SQLOutput;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------");
        System.out.println("Create a Triangle:");

        System.out.println("Enter side1:");
        double side1 = scanner.nextInt();

        System.out.println("Enter side2:");
        double side2 = scanner.nextInt();

        System.out.println("Enter side3:");
        double side3 = scanner.nextInt();

        boolean filled;
        while (true){
            System.out.println("Is this triangle filled (t or f):");
            String filledString = scanner.next();

            switch (filledString){
                case "t":
                    filled = true;
                    break;
                case "f":
                    filled = false;
                    break;
                default:
                    System.out.println("Error");
                    continue;
            }
            break;
        }

        System.out.println("What's the color of this triangle:");
        String color = scanner.next();

        try {
            Triangle2 triangle = new Triangle2(side1, side2, side3);
            triangle.setFilled(filled);
            triangle.setColor(color);

            System.out.println("----------------");
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
        }
        catch (TriangleException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
