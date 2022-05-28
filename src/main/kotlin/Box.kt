/*class Box {
    val length :Int=8
    val width :Int=18
    val heigth :Int=6

    val volume get() = length * width * heigth

    var boxName: String = "Box Name"
        set(value) {
            if(value.length <3){
                println("Box name must be at least 3 characteres long")
            }else {
                field=value
            }
        }

    fun fillContents(){
        println("Filling the box with contents")
    }

    fun open(){
        println("Opening the box")
}

}*/
class Box (
    val length :Int=0,
    val width :Int=0,
    val heigth :Int=0,
) {

    init {
        println("Box is created")
    }

    constructor() : this(0, 0, 0) {
        println("Secondary constructor called")
    }

    val volume get() = length * width * heigth

    var boxName: String = "Box Name"
        set(value) {
            if (value.length < 3) {
                println("Box name must be at least 3 characteres long")
            } else {
                field = value
            }
        }

    fun fillContents() {
        println("Filling the box with contents")
    }

    fun open() {
        println("Opening the box")
    }
}