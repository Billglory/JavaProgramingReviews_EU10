package Day45_Abstraction.Shape;

public class Circle extends Shape{

    private double radius;

    public final static double pi =3.14;


    public Circle(final double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(final double radius) {
        if (radius < 0) {
            throw new RuntimeException("Invalid Radius: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * radius * pi;
    }


}


