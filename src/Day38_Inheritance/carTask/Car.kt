package Day38_Inheritance.carTask

open class Car(var brand: String, var model: String, var year: Int, var price: Double, var color: String, var miles: Int) {
    open fun start() {
        println("$brand $model is starting")
    }

    fun drive() {
        println("$brand $model is driving")
    }

    override fun toString(): String {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}'
    }
}