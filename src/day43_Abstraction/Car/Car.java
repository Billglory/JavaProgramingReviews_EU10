package day43_Abstraction.Car;

public class Car {
    private final String brand, model;
    private String color;
    private final int year;
    private double price;


    public Car(final String brand, final String model, final String color, final int year, final double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
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
        this.price = price;
    }
}
