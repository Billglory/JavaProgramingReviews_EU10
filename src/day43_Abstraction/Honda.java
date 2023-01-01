package day43_Abstraction;

public class Honda extends Car {

    public Honda(final String brand, final String model, final String color, final int year, final double price) {
        super(brand, model, color, year, price);
    }

    public void stop() {
        System.out.println("");
    }


    public void start() {
        System.out.println("Twist the key to ignition");
    }
}

/*
public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }



    }



 */