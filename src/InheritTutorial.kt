import kotlin.math.max

fun main(){
    val rect = Rectangle(5.0)
    val circle = Circle(3.0)
    val maxAreaRectAndCircle = maxArea(rect,circle)
    println("The max area of the rectangle and the circle is $maxAreaRectAndCircle")
}

fun maxArea(shape1: Shape, shape2: Shape):Double{
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if(areaShape2 > areaShape2) areaShape1 else areaShape2
}

//fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape):Double{
//    val maxAreaShape1Shape2 = maxArea(shape1,shape2)
//    val areaShape3 = shape3.area()
//    return if (maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
//}