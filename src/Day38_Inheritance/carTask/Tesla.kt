package Day38_Inheritance.carTask

class Tesla(brand: String, model: String, year: Int, price: Double, color: String, miles: Int) : Car(brand, model, year, price, color, miles) {
    fun autoPilot() {
        println("$brand $model in autopilot mode")
    }

    override fun start() {
        println("Say \"Start\" to start $brand $model")
    }
}