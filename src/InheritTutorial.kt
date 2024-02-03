import kotlin.math.max
import java.lang.NumberFormatException

fun main(){
    val rect = Rectangle(5.0)
    val circle = Circle(3.0)
    val maxAreaRectAndCircle = maxArea(rect,circle)
    println("The max area of the rectangle and the circle is $maxAreaRectAndCircle")

    //exception handling
    println("--------------------------")
    val division = try{
        divide(5.0,0.0)
    }catch (e: DivisionByZeroException){
        0.0
    }
    println("The result of the division is $division")
    println("--------------------------")
    println("Please enter a number: ")
    val input = try{
        readLine()?.toInt()
    } catch (e: NumberFormatException){
        //considers zero if the error is being thrown
        0
    }   finally {
        println("This is from the finally block")
    }
    println("You entered: $input")
}

//after exception, it is message which needs to be printed
class DivisionByZeroException : Exception("You can't divide by zero, please choose a different number")
fun maxArea(shape1: Shape, shape2: Shape):Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if(areaShape2 > areaShape2) areaShape1 else areaShape2
}

fun divide(a:Double,b:Double):Double{
    if(b == 0.0){
        throw DivisionByZeroException()
    }
    return a/b
}

//fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape):Double{
//    val maxAreaShape1Shape2 = maxArea(shape1,shape2)
//    val areaShape3 = shape3.area()
//    return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
//}