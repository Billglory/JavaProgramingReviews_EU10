package day43_Abstraction.Employee;

public abstract class Employee extends Person {

    private final int id;
    private String jobTitle;
    private double salary;

    protected Employee(final String name, final int age, final char gender, final int id, final String jobTitle, final double salary) {
        super(name, age, gender);
        if (id <= 0) {
            throw new RuntimeException("Invalid ID: " + id);
        }
        this.id = id;
        setJobTitle(jobTitle);
        setJobTitle(jobTitle);
    }

    public int getId() {
        return this.id;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(final String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public abstract void work();

    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}