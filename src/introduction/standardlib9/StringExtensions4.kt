package introduction.standardlib9

fun main(args: Array<String>) {

    val string : String? = "Hello"

    val me = string?.let {
        it.length
//        it.toUpperCase()
    }

    print(me)
}