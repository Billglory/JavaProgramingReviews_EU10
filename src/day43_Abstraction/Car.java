package day43_Abstraction;


public  abstract class Car {
    private final String brand, model;
    private String color;
    private final int year;
    private double price;

    public Car(final String brand, final String model, final String color, final int year, final double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);

        if (year < 1886) {
            throw new RuntimeException("Invalid Year: " + year);
        }

        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getYear() {
        return this.year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public void setPrice(final double price) {

        if (price <= 0) {
            throw new RuntimeException("Invalid price: " + price);
        }

        this.price = price;
    }

    public abstract void stop();

     public abstract void start();

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

/*
     System.out.println("Press the brake");
 */