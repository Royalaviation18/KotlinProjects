//defining constructor for that class Rectangle (within these)
class Rectangle (
    //Primary constructor
    //kinda data members for the class
    val a: Double,
    val b: Double
) :Shape("Rectangle"){

    //Secondary constructor
    //this here refers to primary constructor
    //we are passing two times 'a' here as we are creating a square rectangle
    //also for secondary constructor we don't need to pass the val/var type for the variable
    constructor(a: Double): this(a,a)
    //here a.toDouble is the 'a' which is of Int type and we are typecasting
    constructor(a: Int,b: Int): this(a.toDouble(),b.toDouble())
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