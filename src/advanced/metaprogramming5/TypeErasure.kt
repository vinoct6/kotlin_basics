package advanced.metaprogramming5


fun <T> printList(list : T) {
    /*when(list) {
        is List<String> -> println("list of strings ")
        is List<Int> -> println("list of int ")
    }*/

    if(list is List<*>){
        //this is the only thing I cna do
    }
}

//Reified generics
//Inline functions can be reified
inline fun <reified T> erased(input : List<Any>) {
    if( input is T) {

    }
}

fun main(args: Array<String>) {
    val listStrings  = listOf("One","Two","three")
    val listNumbers = listOf(1,2,3)
}