package assignment1_MyPart;
import java.util.Scanner;

//Abstract class GeometricObject
abstract class GeometricObject {
 private String color;
 private boolean filled;

 // No-arg constructor
 public GeometricObject() {
     this.color = "white";
     this.filled = false;
 }

 // Protected overloaded constructor
 protected GeometricObject(String color, boolean filled) {
     this.color = color;
     this.filled = filled;
 }

 // Accessor and mutator methods for color
 public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 // Accessor and mutator methods for filled
 public boolean isFilled() {
     return filled;
 }

 public void setFilled(boolean filled) {
     this.filled = filled;
 }

 // Abstract methods
 public abstract double getArea();

 public abstract double getPerimeter();
}

//Triangle class that inherits GeometricObject class
class Triangle extends GeometricObject {
 private double side1;
 private double side2;
 private double side3;

 // No-arg constructor for default triangle
 public Triangle() {
     this.side1 = 1.0;
     this.side2 = 1.0;
     this.side3 = 1.0;
 }

 // Constructor with  sides
 public Triangle(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 // Getter methods for sides
 public double getSide1() {
     return side1;
 }

 public double getSide2() {
     return side2;
 }

 public double getSide3() {
     return side3;
 }

 // Method to calculate the area of the triangle
 @Override
 public double getArea() {
     double s = (side1 + side2 + side3) / 2;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }

 // Method to calculate the perimeter of the triangle
 @Override
 public double getPerimeter() {
     return side1 + side2 + side3;
 }

 // Method to provide a string description of the triangle
 @Override
 public String toString() {
     return "Triangle: side1=" + side1 + ", side2=" + side2 + ", side3=" + side3;
 }
}



public class TestTriangle {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter sides, color, and filled status
        System.out.print("Enter side1, side2, side3: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        

        System.out.print("Enter color: ");
        String color = input.next();

        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = input.nextBoolean();

        // Create a Triangle object
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        
        System.out.println(triangle.toString());

        // Display 
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());

      
        input.close();
    }

}
