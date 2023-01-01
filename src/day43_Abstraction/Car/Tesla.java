package day43_Abstraction.Car;

public class Tesla extends Car{


    public Tesla(String brand, final String model, final String color, final int year, final double price) {
        super("Tesla", model, color, year, price);
    }


    public void start() {
        System.out.println("Say \"start\"");
    }

    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has auto pilot feature");
    }

}
