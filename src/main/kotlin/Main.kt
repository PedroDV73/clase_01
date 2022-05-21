import kotlin.math.*

fun main() {
    // Boolean size 1bit false/true
    // Char size 16bit 'a' to 'z' '/n' '/101'
    /*
    Numbers
    * Byte size 8bit -127 to 128
    * Double size 64bit 3.4d
    * Float size 32bit 3.4f
    * Int size 32bit -2 -1 0 1 2
    * Long size 64bit -2L -1L 0L 1L 2L
    * Short size 16bit none
    */
    // String "Hello"
    // Array of int [1, 2, 3]
    // Uso de variables
    val dayOfBirth : Int = 20
    val monthOfBirth : Int = 1
    println("My birthday is $dayOfBirth/$monthOfBirth")
    // Concatenacion de variables
    println("My birthday is: " + dayOfBirth + "/" + monthOfBirth)
    var name : String = "Pedro"
    var lastName : String = "Del valle"
    println("My name is ${name.uppercase()} ${lastName.lowercase()}")
    name = "Peter"
    println("My name is $name $lastName")
    // Operaciones matematicas
    // Suma
    println(2+2)
    // Resta
    println(2-2)
    // Division
    println(2/2)
    // Modulos
    println(2%2)
    // Multiplicacion
    println(2*2)
    // Potencia
    println(2.0.pow(2))
    // Operacion Matematica
    print(1 + (9 /3) * 2)

    // Comparacion e igualdad operadores
    // Igualdad
    println(2 == 2)
    // Desigualdad /  Diferencia
    println(2 != 2)
    // Mayor que
    println(2 > 2)
    // Menor que
    println(2 < 2)
    //  Mayor o igual que
    println(2 >= 2)
    // Menor o igual que
    println(2 <= 2)
    var anyNumber: Int = 0
    // Operadores de asignacion
    anyNumber += 10
    anyNumber -= 2
    anyNumber *= 2
    anyNumber /= 2
    anyNumber %= 2
    // Incrementador y decrementador
    anyNumber++
    anyNumber--
    println(anyNumber)
    var isTrue : Boolean = true
    var isFalse : Boolean = false
    // Operaciones Booleanos logicos
    // AND
    println(isTrue && isFalse)
    // OR
    println(isTrue || isFalse)
    // NOT
    println(!isTrue)
    helloWorld()
    var myNumber : Int = dobleTheValue(2)
    println(myNumber)
    favoriteFoodPrompt("Pamela", "Sushi")

}
fun helloWorld(){
    println("Hello World")
}
fun dobleTheValue(numberValue: Int) : Int{
    return numberValue * 2
}

fun favoriteFoodPrompt(name: String, favoriteFood : String) : Unit {
    println("$name's favorite food is $favoriteFood")
}