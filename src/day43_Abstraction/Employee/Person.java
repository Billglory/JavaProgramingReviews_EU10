package day43_Abstraction.Employee;

public abstract class Person {
    private String name;
    private int age;
    private char gender;

    protected Person(final String name, final int age, final char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        if(age <= 0){
            throw new RuntimeException("Invalid age: "+age);
        }
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(final char gender) {
        this.gender = gender;
    }

    public abstract void sleep();

    public void eat(){
        System.out.println(name+" is eating baklava");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
