//any allows nullable types
//any is the parent class in kotlin
//any can be anything

class CustomTriple<A : Any,B : Any,C : Any>(
    var first: A,
    var second: B,
    var third: C
) {
    fun printTypes(){
        println("The type of first is ${first::class}")
        println("The type of second is ${second::class}")
        println("The type of third is ${third::class}")
    }
}