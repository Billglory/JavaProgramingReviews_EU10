package Day45_Abstraction.Shape;

public abstract class Shape {
    private final String name;

    public Shape(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract double area();{

    }

    public abstract double perimeter();

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter()+ '\'' +
                '}';
    }
}
