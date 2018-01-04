package advanced.functions1

fun op(x: Int , op : (Int) -> Int) : Int {
    return op(x)
}

fun main(args: Array<String>) {

    op(3, { it  * it})

    //Note the anonymous function - there is no name
    //1. I can express the return type here
    //2. Have  multiple return points
    op(3, fun (x:Int) : Int {
        if (x >5 ) return x
        else return x*x
    })

}