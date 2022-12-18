package day37_Inheritance.scrumTask

open class Person(var name: String, var age: Int, var gender: Char) {
    fun eat(food: String) {
        println("$name is eating $food")
    }

    fun drink(drink: String) {
        println("$name is drinking $drink")
    }

    override fun toString(): String {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}'
    }
}