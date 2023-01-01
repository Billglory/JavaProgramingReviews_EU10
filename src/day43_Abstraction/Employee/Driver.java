package day43_Abstraction.Employee;

public class Driver extends Employee{

    public Driver(final String name, final int age, final char gender, final int id, final String jobTitle, final double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 10 hours");
    }
}

