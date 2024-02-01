//defining constructor for that class Rectangle (within these)
class Rectangle (
    //kinda data members for the class
    val a: Double,
    val b: Double
) :Shape("Rectangle"){
    init {
        //If you want to run some code during object creation, use initializer blocks inside the class body.
        // Initializer blocks are declared with the init keyword followed by curly braces.
        // Write any code that you want to run within the curly braces.
        println("$name created with a = $a and b = $b")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area() = a * b
    override fun perimeter() = 2*(a+b)
    fun isSquare() = a == b
}