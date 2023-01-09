package Day45_Abstraction.Shape;

public class Square extends Shape {


    private double side;

    public Square(double side) {
        super("Square");
       setSide(side);
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(final double side) {
        if (side <= 0) {
            throw new RuntimeException("Invalid Side: " + side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}