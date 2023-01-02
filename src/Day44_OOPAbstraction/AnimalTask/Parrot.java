package Day44_OOPAbstraction.AnimalTask;

public final class Parrot extends Animal implements Playable,Flyable{
    public Parrot(final String name, final String breed, final char gender, final int age, final String size, final String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating chocolate");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }

    /*



    @Override
    public void play() {

    }


    @Override
    public void fly() {
        System.out.println(getName()+" can fly 20km/h");

     */
    }

