package Day45_Abstraction.Shape;

public class Triangle extends Shape{
    public Triangle(final String name) {
        super(name);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
