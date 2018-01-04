package advanced.functions1

/**
 * Takes an inline function and inlines it - basically copy and paste
 * lambdas to where it is being called. Flattening it -
 * This provides us with optimization - We are eliminating
 * unncessary anon functions , calls stacks etc.
 *
 *
 * But everytime you call this inline function, it will be copied
 * so there is that price we are paying for adding inline modifier.
 *
 * It only makes sense only when you are using lambdas
 */

inline fun operation(op: () -> Unit){
    println( "Before calling op")
    op()
    println( "After calling op")

}

/**
 * If you have multiple lambdas, you can say not to inline few things
 */

inline fun operation1(op1: () -> Unit, noinline op2: () -> Unit){
    println( "Before calling op")
    op1()
    op2()
    println( "After calling op")

}

//Cannot inline this function,
fun tryingToInline(op: () -> Unit) {
    val ref = op
    op()
}

fun main(args: Array<String>) {
   operation {
       println("An operation")
   }
}