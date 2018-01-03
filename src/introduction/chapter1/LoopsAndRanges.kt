package introduction.chapter1

fun main(args: Array<String>) {


    val nums = 1..100

    for( a  in 1..10) {
        println (a)
    }



    for (a in 100 downTo  1)  //Reverse loop
        println(a)

     for (a in 100..1)  //Reverse loop
        println(a)

    val cities = listOf("London","Rome","Chennai")

    for (city in cities){
        println(city)
    }


}

