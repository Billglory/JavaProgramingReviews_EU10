package day43_Abstraction.Car;

public class Audi extends Car{


    public Audi(String brand, final String model, final String color, final int year, final double price) {
        super("Audi", model, color, year, price);
    }

    public void start() {

    }
    public void autoPark(){
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }
}

