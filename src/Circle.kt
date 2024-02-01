import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction

class Circle(
    val radius : Double

) : Shape("Circle") {
    //only visible (usable) in Circle class
    private val pi = 3.14

    init {
        println("$name is created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = radius * radius * pi
    override fun perimeter() = 2 * radius * pi
}