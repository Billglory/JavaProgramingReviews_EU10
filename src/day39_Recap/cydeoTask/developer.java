package day39_Recap.cydeoTask;

public class developer extends Employee {


    public developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void fixingBugs(){
        System.out.println(getJobTitle()+" "+getName()+" is fixing the bug");

    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is developing the application");
    }
}
/*


    }

    @Override
    public void work() {

    }


}

/*
4. Create a sub class of Employee named Developer
            Override the work method
            Extra methods:
                fixingBugs()

 */