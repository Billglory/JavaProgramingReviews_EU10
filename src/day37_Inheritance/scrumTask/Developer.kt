package day37_Inheritance.scrumTask

class Developer(name: String, age: Int, gender: Char, jobTitle: String, id: Int, salary: Double, companyName: String) : Employee(name, age, gender, jobTitle, id, salary, companyName) {
    fun fixBugs() {
        println((jobTitle + " " + name).toString() + " is crying")
    }
}