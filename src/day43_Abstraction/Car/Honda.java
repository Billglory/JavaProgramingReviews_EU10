package day43_Abstraction.Car;

public class Honda extends Car {

    public Honda(String brand, final String model, final String color, final int year, final double price) {
        super("Honda", model, color, year, price);
    }
    public void stop(){
        System.out.println(" ");
    }

    public void start(){
        System.out.println("Twist the key to ignition");
    }

}
