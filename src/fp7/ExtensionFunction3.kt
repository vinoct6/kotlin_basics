package fp7

/**
 * I can extend the class without having to inherit from it
 *
 */


fun String.hello() {
    println("It's me")
}

fun String.toTitleCase(): String {
    return this.split("").joinToString() { it.capitalize() }
}

fun main(args: Array<String>) {
    "Hello".hello()   // prints the value

    println("This is sample String".toTitleCase())

    val c = Customer()

    c.makePreferred()
}

// Here Member functions take precedence
class Customer {
    fun makePreferred() {
        println("Customer version")
    }
}

fun Customer.makePreferred() {
    println("Extension fun")
}