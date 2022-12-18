package day37_Inheritance.scrumTask

class Tester(name: String, age: Int, gender: Char, jobTitle: String, id: Int, salary: Double, companyName: String) : Employee(name, age, gender, jobTitle, id, salary, companyName) {
    fun createTicket() {
        println((jobTitle + " " + name).toString() + "is creating ticket")
    }
}