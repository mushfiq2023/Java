
public  abstract class GeometricObject {

    private  String color = "white";
    private Boolean filled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public GeometricObject()
    {

    }

    protected  GeometricObject(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }


    public abstract double getArea();

    public abstract double getPerimeter();


}
