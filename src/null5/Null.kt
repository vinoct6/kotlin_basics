package null5


class Service {
    fun evaluate() {

    }
}

class ServiceProvider {
    fun createService(): Service? {
        return null
    }
}


/**
 * By default Kotlin is null safe
 */

fun main(args: Array<String>) {

//    val msg  :String = null  - This statement won't compile, kotlin does not allow you to initialize null

    val msg: String = "Message "

    println(msg.length)

    // You could declare variables as Nullable

    val nullMessage: String? = null
    var nullMessage1: String? = "hi"
    val inferredNull = null

//    println(nullMessage.length) // Only safe calls are allowed

    nullMessage1 = "hello"

    println(nullMessage1.length)

    // But we don't know whether a value will be null at compile time

    if (nullMessage != null) {
        println(nullMessage.length)
    }

    // Instead of the above statement, you could put a question mark

    println(nullMessage?.length)


    val sp = ServiceProvider()

    sp.createService()?.evaluate()

    // !! - Tell the compiler to stop complaining and not worry
    val x : String? = null
    println(x!!.length)
}