package day37_Inheritance.scrumTask

class Employee(name: String, age: Int, gender: Char, //Employee is A Person
               var jobTitle: String, var id: Int, var salary: Double, var companyName: String) : Person(name, age, gender) {
    fun work() {
        println(jobTitle + " " + name + "is working")
    }

    override fun toString(): String {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}'
    }
}