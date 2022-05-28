/*fun main() {
    val box1 = Box();
    val box2 = Box();
    val box3 = Box();

    println("Heigh: ${box1.heigth}");
    println("Widht: ${box1.width}");
    println("Lenght: ${box1.length}");
    println("Volume: ${box1.volume}");
    box1.boxName = "Shoes box";
    println("Box name: ${box1.boxName}");
    box1.open();
    box1.fillContents();

}*/
    /*fun main() {
    val box1 = Box(5, 15, 6);
    val box2 = Box();
}*/

/*fun main() {
    val coffeeMachine = PremiumCoffeeMachine(10000.0, "Brown")
    coffeeMachine.makeCoffee();
    coffeeMachine.makeCapuccino();

}*/

/* fun main() {
    val coffeeMachine = PremiumCoffeeMachine(10000.0, "Brown")
    val info = coffeeMachine.machineInfo();
    val coffee = coffeeMachine.makeCoffee("CAPPUCCINO")
    println(coffee)
    println(info)

}*/

 /*fun main() {
    val coffeeMachine = PremiumCoffeeMachine(10000.0, "Brown")
    val info = coffeeMachine.machineInfo();
    val coffee = coffeeMachine.makeCoffee("CAPPUCCINO")
    println(coffee)
    println(info)
     val simpleCoffeeMachine=CoffeeMachine(2000.0, "Black")
     val coffe2 = simpleCoffeeMachine.makeCoffee("Expreso")
     print(coffe2)

}*/
class App: DownloadListener {
     override fun onDownloadStarted() {
         println("Download started")
     }

     override fun onDownloadComplete(file: String) {
         println("$file downloaded")
     }

     override fun onProgressUpdate(progress: Int) {
         println("$progress% downloaded")
     }

 }
fun main() {

    val downloader = Downloader()
    downloader.downloadListener = object : DownloadListener {
        override fun onDownloadStarted() {
            println("Download started")
        }

        override fun onDownloadComplete(file: String) {
            println("$file downloaded")
        }

        override fun onProgressUpdate(progress: Int) {
            println("$progress% downloaded")
        }
    }
    downloader.downloadFile("newSong.mp3")



}



    /*fun buildAcuario() {
        val Acuario = Acuario()
        val length :Int=100
        val width :Int=20
        val heigth :Int=40

    Acuario.printSize()
    }

fun main() {
    buildAcuario()
}*/

 /*fun buildAcuario() {
    val myAcuario = Acuario()

    myAcuario.length = 200
    myAcuario.width =40
    myAcuario.heigth = 80

    myAcuario.printSize()

    println(myAcuario.length)
    println(myAcuario.width)
    println(myAcuario.heigth)

}

fun main() {
    buildAcuario()
}*/