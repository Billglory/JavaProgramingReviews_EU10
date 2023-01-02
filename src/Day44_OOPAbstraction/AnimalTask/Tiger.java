package Day44_OOPAbstraction.AnimalTask;

public final class Tiger extends Animal implements Playable {

    public Tiger(final String name, final String breed, final char gender, final int age, final String size, final String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating deer");
    }
    public void hunt() {
        System.out.println(getName()+" hunts deer");
    }

    @Override
    public void play() {

    }
}
