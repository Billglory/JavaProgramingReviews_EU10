package Day38_Inheritance.carTask

class BMW(brand: String, model: String, year: Int, price: Double, color: String, miles: Int) : Car(brand, model, year, price, color, miles) {
    fun breaksDown() {
        println("$brand $model is breaking down")
    }

    fun racing() {
        println("$brand $model is a racing car")
    }

    override fun start() {
        println("Call mechanic to jump start $brand $model")
    }
}