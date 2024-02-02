import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction
import kotlin.random.Random

class Circle(
    val radius : Double

) : Shape("Circle") {
    //only visible (usable) in Circle class

    //Companion object
    companion object{
        fun randomCircle():Circle{
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }
    init {
        println("$name is created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = radius * radius * ImportantNumbers.PI //singleton object
    override fun perimeter() = 2 * radius * ImportantNumbers.PI
}