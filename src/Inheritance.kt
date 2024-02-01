fun main(){
    val myCircle1 = Circle(5.0)
    myCircle1.changeName("First-Circle")
    println(myCircle1.name)
    println("------------------------------------")

    val myRect = Rectangle(5.0,4.0)
    myRect.changeName("First-Rectangle")
    println(myRect.name)
}