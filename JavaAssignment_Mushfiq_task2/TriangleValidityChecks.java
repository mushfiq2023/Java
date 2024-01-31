package assignment1;

public class TriangleValidityChecks extends GeometricObject  {

    double side1 =1.0;
    double side2 = 1.0;


    double side3 = 1.0;

    // Default constructor with already initialized sides above
    public TriangleValidityChecks()
    {

    }



    public void setSides(double side1, double side2, double side3) throws TriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new TriangleException("The sides " + side1 + ", " + side2 + ", " + side3 +
                    " do not form a valid triangle.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Argument constructor with the specified sides
    public TriangleValidityChecks(double side1, double side2, double side3) throws TriangleException {
        setSides(side1, side2, side3);
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3 +
                "\nArea = " + getArea() +
                "\nPerimeter = " + getPerimeter() +
                "\nColor = " + getColor() +
        "\nFilled = " + (getFilled() ? "true" : "false");

    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}