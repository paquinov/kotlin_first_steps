package academy.learning.challenge1

fun main(args: Array<String>) {

    // Declare two immutable String variables called hello1 and hello2. Then assign "Hello" to both variables
    val hello1 : String = "Hello"
    val hello2 : String = "Hello"

    // Using one line of code, test whether hello1 and hello2 are referentially equal and print the result
    println("hello1 and hello2 are referentially equal : ${hello1 === hello2}")

    // Do the same but this time for structural equal
    println("hello1 and hello2 are structurally equal : ${hello1 == hello2}")

    // Declare a mutable variable of type Int and assign it the value of 2988
    var myNumber : Int = 2988

    // Declare an immutable variable of type Any and assign it the string "The Any type is the root of the Kotlin class hierarchy". Then, using a
    // smart cast, print out the uppercased string
    val anyType : Any = "The Any type is the root of the Kotlin class hierarchy"
    if (anyType is String) {
        println(anyType.uppercase())
    }

    /*
    Using one line of code, print out the following. Make sure your code is nicely indented
            1
           11
          111
         1111
     */
    println("""    1
        |   11
        |  111
        | 1111""".trimMargin())
}