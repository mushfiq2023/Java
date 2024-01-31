public class Triangle2 extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    public Triangle2(double side1, double side2, double side3) throws TriangleException {
        super();
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new TriangleException("Invalid sides for a triangle");
        }
    }

    private boolean isValidTriangle(double s1, double s2, double s3) {
        return (s1 + s2 > s3) && (s2 + s3 > s1) && (s1 + s3 > s2);
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

    @Override
    double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }
}
