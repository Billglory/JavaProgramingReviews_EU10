package Day44_OOPAbstraction.AnimalTask;

public abstract class Animal {


    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;


    public final static boolean canBreathe;
    static {
        canBreathe = true;
    }

    public Animal(final String name, final String breed, final char gender, final int age, final String size, final String color) {
        setName(name);

        this.breed = breed;

        if ( !(gender == 'M' || gender =='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;

        setAge(age);
        setSize(size);
        this.color = color;
    }


    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        if (name.isEmpty()){
        throw new RuntimeException("Invalid name");
    }
        this.name = name;
    }

    public String getBreed() {
        return this.breed;
    }

    public char getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(final String size) {
        this.size = size;
    }

    public String getColor() {
        return this.color;
    }

    public final void drink(){
        System.out.println(name+" is drinking");
    }

    public abstract void eat();

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void hunt();

    public abstract void fly();
}
/*
    Animal Task:
        Create an abstract class named Animal:
        Variables:
        name, breed(final), gender(final),  age, size, color(final)
        Encapsulate all the fields
        Add a constructor that can set all the fields
        Methods:
        eat(); ==> different animals eat different foods
        drink() ==> all the animals drink water
        toString() ==> to display the full info of the animal
        */