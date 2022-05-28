/*open class BaseCoffeeMachine (
    private val price: Double,
    private val color: String
){

    fun makeCoffee() {
        println("Here is your coffee")
       }


}*/

/* abstract class BaseCoffeeMachine (
    private val price: Double,
    private val color: String
){

   abstract val brand: String
   abstract fun makeCoffee(type: String): String

   open fun machineInfo() : String {
       return "Coffee Machine Details:\n" +
               "Brand: $brand\n" +
               "Color: $color\n" +
               "Price: $price\n"
}


}*/

abstract class BaseCoffeeMachine (
    private val price: Double,
    private val color: String
) {

    abstract val brand: String
    abstract fun makeCoffee(type: String): String

    fun machineInfo(): String {
        return "Coffee Machine Details:\n" +
                "Brand: $brand\n" +
                "Color: $color\n" +
                "Price: $price\n"
    }
}

