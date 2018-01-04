package advanced.functions1

/**
 * Some compilers can do what is called the tail call optimization
 * - making recursion a little more performant
 * Problems with recursion - stackoverflow and lots of call stacks
 *
 * Tail call optimization - Kotlin does not do that by default
 * In the Tail recursive function - last call should be to the function itself
 *
 * In this case  "number * factorial(number - 1)" , it is not that
 * We can change that, look at the other function
 */


fun factorial(number: Int): Int {
    return when (number) {
        0, 1 -> 1
        else -> number * factorial(number - 1)
    }
}

tailrec fun factorialTR(number: Int, accumulator: Int): Int {
    return when (number) {
        0 -> accumulator
        else -> factorialTR(number - 1, accumulator * number)
    }
}