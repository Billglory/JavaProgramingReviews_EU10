package day37_Inheritance.scrumTask

class BusinessAnalyst(name: String, age: Int, gender: Char, jobTitle: String, id: Int, salary: Double, companyName: String) : Employee(name, age, gender, jobTitle, id, salary, companyName) {
    fun analyze() {
        println(name + " is analyzing the documents")
    }
}