package day43_Abstraction.Employee;

public class Tester extends Employee{

    public Tester(final String name, final int age, final char gender, final int id, final String jobTitle, final double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleeps 8 hours");
    }
    public void bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }
}
