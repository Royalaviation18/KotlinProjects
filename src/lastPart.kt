fun main(){
    //lambda function
    var list = (1..20).toList()
    println(list)
    //filter will be getting one number at time from the list
    //'it' here refers to the current data (in this case number, it can be string or anything) fetched by filter
    list = list.filter { it % 2 == 0 }
    //list now will only have even number
    println(list)

    val circle1 = Circle(5.0)
    val circle2 = Circle(3.5)
    val rectangle1 = Rectangle(6.0)
    val rectangle2 = Rectangle(4.0,3.0)

    //generics
    var integers = (1..10).toList().customFilter { it > 5}
    var triple = Triple<Int, String, Boolean>(3,"hello",true)
    var customTriple = CustomTriple<Int, String, Boolean>(3,"Hello", true)
    customTriple.printTypes()

    var shapes = listOf(circle1,circle2,rectangle1,rectangle2)
    shapes = shapes.customFilter { it.area() > 20.0 }.sortedBy { it.area() }
    for(shape in shapes){
        println("${shape.name}: Area = ${shape.area()}")
    }

}

//creating our own filter function
//here List<Shape> is an extension function
//'->' means returns here
//filterFunction : <Type of the function :here its shape, returns a boolean value, whole function returns a List of Shape
//T is just a naming convention for generic function, it can be anything
//fun <T> writing for generic
fun <T> List<T>.customFilter(filterFunction: (T) -> (Boolean)): List<T>{
    val resultList = mutableListOf<T>()
    //this here is the shape in the list
    for(item in this){
        if(filterFunction(item)){
            resultList.add(item)
        }
    }
    return resultList
}