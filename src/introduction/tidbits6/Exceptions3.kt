package introduction.tidbits6

/**
 * No Checked exceptions here
 */

// Base class is Throwable
class NotANumberException(message: String) : Throwable(message)

fun checkANumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number")

    }
}

fun main(args: Array<String>) {

    try {
        checkANumber("String")
    } catch (e: NotANumberException) {
        println("${e.message}")
    }
}