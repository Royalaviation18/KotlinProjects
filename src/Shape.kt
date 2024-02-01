//open here means that this class can be inherited from
//abstract class can't be instantiated
abstract class Shape(
    var name: String
) {
    init {
        println("I am the super class")
    }
    abstract fun area(): Double
    abstract fun perimeter(): Double
    fun changeName(newName: String){
        name = newName
    }
}