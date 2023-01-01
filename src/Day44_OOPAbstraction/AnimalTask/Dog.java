package Day44_OOPAbstraction.AnimalTask;

public class Dog extends Animal{

    public Dog(final String name, final String breed, final char gender, final int age, final String size, final String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats Pizza");
    }
    public void play(){
        System.out.println(getName() +" is playing with ball");
    }
}
