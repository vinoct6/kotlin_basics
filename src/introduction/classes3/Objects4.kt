package introduction.classes3

/**
 * This is a singleton
 */
object Global {
    val PI = 3.14
}

/**
 * Object declarations are initialized in a lazy way
 * and experessions are immedietly initialized
 */

fun main(args: Array<String>) {

    // Object experssion
    val localObject = object {
        val PI = 3.14
    }


    println(Global.PI)
    println(localObject.PI)
}