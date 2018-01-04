package advanced.functions1

/**
 * Local functions - A Function inside a function
 * Useful in code organization
 */
fun foo(fooParam: String) {

    val outerVar = "Hi"

    fun bar(barParam: String) {
        println(barParam)
        println(fooParam) // Inner params can have access to parameters from outside
        println(outerVar)
    }
}


fun main(args: Array<String>) {
    foo("Hllo")

    //I cannot access bar from here. It is a local function
}