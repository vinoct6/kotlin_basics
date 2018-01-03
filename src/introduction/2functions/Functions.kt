package introduction.`2functions`


/**
 * Can create a top level function
 */


// Unit is like void , but it is an object that you can compare to
// You can say, if the return type is something, then do something
fun hello(): Unit {
    println("Hello ")
}

/**
 * Then there is Nothing. You can use it to represent value that
 * never exists
 */

fun throwException(): Nothing {
    throw Exception("This is an exception")
}


fun returnsFour(): Int { // There is type inference - You can eliminate it
    return 4
}

//Expression function
fun add(x: Int, y: Int) = x + y

//Default values, z= 5 is default
//Default and named parameters
fun sum(x: Int, y: Int, z: Int = 5, w: Int = 4) = x + y + z + w

//varargs

fun printString(vararg strings: Array<String>) {
    reallyPrintStrings(*strings)  //Spread Operator - Pass Vararg to another function
}

fun reallyPrintStrings(vararg strings: Array<String>) {
    for (string in strings) {
        println(string)
    }
}


fun main(args: Array<String>) {
    hello()

    //Calling with named parameters
    //Named parameters allow changing the order as well
    println(sum(1, 2, w = 6))
}
