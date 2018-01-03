package introduction.standardlib9

// Lazy (I only evaluate things only when I strictly need it) vs Eager Evaluation

fun main(args: Array<String>) {

    val elements = 1..10000000

    val output = elements.filter { it < 30 }.map { Pair("Yes", it) }

    output.forEach {
        println(it)
    }


    //Lazy
    val output1 = elements.asSequence().filter { it < 30 }.map { Pair("Yes", it) }


    val num = generateSequence(1) { x -> x + 10 }


    //Lazy initiliazation
    val lazyInit: Int by lazy { 10 }


}