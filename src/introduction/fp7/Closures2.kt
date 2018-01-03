package introduction.fp7

fun outsideFn() {
//    val num = 10

    //Let there by unary operator that operates on this number
    /*
    Notice that, you did not pass 10 explicitly, but unaryOperation is able to access this
    Allows me to access values outside of the lambda expressios that I'm actually declaring

    The IDE says 'The value has been captured in a closure' .
     */

    for( num in 1..30) {
        unaryOperation(20 , {x ->
            println(num)
            x * num
        })
    }

}

fun main(args: Array<String>) {

}