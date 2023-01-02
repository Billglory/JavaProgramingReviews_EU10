package Day44_OOPAbstraction.AnimalTask;

public  class Cat extends Animal {

    public Cat(final String name, final String breed, final char gender, final int age, final String size, final String color) {
        super(name, breed, gender, age, size, color);
    }

    public void meow() {
        System.out.println(getName() + " is Meowing");
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating biryani");
    }

    public void play() {


    }
}
