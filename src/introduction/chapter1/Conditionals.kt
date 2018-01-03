package introduction.chapter1

import java.io.File as myfile // Named import


fun main(args: Array<String>) {

    val myString = "not empty"

    if ( myString.isNotEmpty()) {

    }


    // if as an expression

    val result = if (myString.isNotEmpty()){
        "Not empty"
    }else{
        "Empty"
    }

    println(result)



    //case

    when(result) {

        is String -> println("Excellent")
        "Value" -> println("Value")

    }


    //you could assign when  like if did with if
}