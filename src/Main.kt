import kotlin.math.exp

fun main() {
    println("Hello World!")
    println("This function will be running")
    var myVariable: Int = 4
    println(myVariable)
    var mySecondVariable = 5
    println("The value of our variable is: $mySecondVariable")
    mySecondVariable = 7
    println("The value of our variable is now: $mySecondVariable")

    //we can't change the value of variable with 'val' declare type
    val myFirstVariable = 10
    println("The value of the variable which can't be changed: $myFirstVariable")
    var isNumber: Boolean = true

    val myAge = 22
    var myFavouriteNumber = 18
    println("My age is : $myAge")
    println("My favourite number is :$myFavouriteNumber")

    //Arithmetic Operators (+,-,*,/)
    var x = 15
    var y = 7
    println(x+y)
    val result = x+y
    println("The sum of both the numbers : $result")

    myVariable++
    println("The value of the variable : ${++myVariable}")
    myVariable++

    println("The value of the variable : $myVariable")
    x += 10
    println("The sum of the variable : ${x+y} ")
    println("The result of x/y : ${x/y}")
    //float = 32 bits
    var z = 20F
    //double = 64 bits
    //var z =20.343834939403030322
    println("The result of z/y : ${z/y}")

    //Strings
    val string = "this is an example text"
    println(string)
    println("Our string is : ${string.length}")

    //logical and comparison operators
    val a = 4
    val b = 5
    println(a == b)

    //if conditions
    val m = 7
    val n = 7
    val o = if(m+n == 14) 8 else 9

    if(m < n ){
        println("N is greater $n")
    } else if(m > n){
        println("M is greater $m")
    } else{
        println("M is equal to N")
    }
    println("this will always be executed")
    println("The value of o : $o ")

    //null values and user input
    //string is nullable that's why its by default string
//    val userInput = readLine()
//    println("Hello ${userInput?.toUpperCase()}")
//    if (userInput !=null )
//        println(userInput.toInt() - 5)

    //Arrays

    val myArray = arrayOf("hello","guys","whats up?")
//    println(myArray[0])

    //while loop
    var d = 3
    while(d > 0){
        println("Hello")
        d--
    }
    println("Exit")
    val arrayLength = myArray.size
    var i = 0
    while(i <arrayLength){
        println(myArray[i])
        i++
    }

    //for loop
    val mySecondArray = arrayOf(1,2,3)
    for(i in mySecondArray){
        println(i)
    }
    //8..16 this is called a range
    for (i in 8..16){
        println(i)
    }
    //step is a jump
    for (i in 10 downTo 5 step 2){
        println(i)
    }
    for (i in 'a'..'z'){
        println(i)
    }
    val myLatestArray = arrayOf(5,4,2,9,10,3)
    var max = myLatestArray[0]
    for(item in myLatestArray){
        if(item>max){
            max = item
        }
    }
    println("The largest element in the array is : $max")
    //lists
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)
    //the value of array can be changed at runtime, but not with lists
    // are immutable
    val myList = mutableListOf(1,2,3)
    //the value of mutablelist can be changed
    //the mutable list can even change size, but not with array
    myList.add(4)
    println(myList)
    //remove function removes the element
    myList.remove(2)
    println(myList)
    //removeAt function removes from the index
    myList.removeAt(0)
    println(myList)

    //list user input
//    val userList = mutableListOf<Int>()
//    for (i in 1..10){
//        val g = readLine()?.toInt()
//        if (g !=null){
//            userList.add(g)
//        }
//    }
//    println(userList)

//    val age = readLine()?.toInt()
//    //when
//
//    when(age){
//        in  0..5 -> println("You're a young kid")
//        in 6..17 -> println("You're a teenager")
//        18 -> println("Finally, you're 18")
//        19,20 -> println("You're a young adult")
//        in 21..65 -> println("You're an adult")
//        else -> println("You're really old")
//    }

    //functions and parameters
    printThreeLines()
//    val pow: Int
//    println("Enter the base value")
//    val base = readLine()?.toInt()
//    println("Enter the exponent value")
//    val exponent = readLine()?.toInt()
//    if (base != null && exponent != null) {
//         printPow(base, exponent)
//    }
    val pow = printPow(4,5)
    println("The result of 4 to the power of 5 is $pow")
    println(multiply(3,5))
    val list2 = listOf(1,2,3)

    var arr = intArrayOf(27,2,7)
    val maximum = getMax(1,4,5,6,*arr,11,15,14,21,3)
    println("The maximum is $maximum")
    searchFor("How to become good programmer")
    searchFor("How to become good engineer","Bing")
    //named argument, arguments can be used in any order if using named argument
    searchFor(search = "How to become best version of yourself", searchEngine = "Yahoo")

    //extension function
    println("Please enter a number")
    val input = readLine()?.toInt()

    if(input != null){
        //using extended function
        input.isPrime()
    }

}

//extension function
//type to be extended.function name
//Int (type).isPrime(function name)
fun Int.isPrime(): Boolean{
    //this here is the input (line 187)
    for(i in 2 until this - 1){

    }
}

//default arguments

fun searchFor(search: String, searchEngine: String ="Google"){
    println("Searching for '$search' on $searchEngine")
}

//vararg
fun getMax(vararg numbers: Int): Int{
    var max = numbers[0]
    for(number in numbers){
        if (number > max) max = number
    }
    return max
}


fun printThreeLines(){
    println("Hey There")
    println("Hello World")
    println("Kotlin")
}

fun multiply(a : Int, b: Int) = a * b

//passing list as a parameter
fun printFirstItem(list: List<Int>) = println(list[0])

//functions with return value
fun printPow(base: Int, exponent: Int) : Int {
    var result = 1
    for(i in 1..exponent){
        result  *= base
    }
    return result
}

