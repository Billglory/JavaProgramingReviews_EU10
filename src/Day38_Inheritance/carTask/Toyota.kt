package Day38_Inheritance.carTask

class Toyota(brand: String, model: String, year: Int, price: Double, color: String, miles: Int) : Car(brand, model, year, price, color, miles) {
    fun reliable() {
        println("$brand $model is reliable")
    }

    override fun start() {
        println("Twist the key to ignition to start $brand $model")
    }
}