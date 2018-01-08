package advanced.classes2

import sun.jvm.hotspot.debugger.Page

// ADT
/**
 * Sealed classes - enforce a restriction on what classes can inherit from a base class
 */


class PageResult(val result: String, val isError: Boolean)


sealed class PageResult1 {

    //sealed means only these classes can inherit from sealed class.
    //They can be inside same file
    class Success(val content: String) : PageResult1()

    class Error(val code: Int, val message: String) : PageResult1()

}

fun getURLPage(url: String): PageResult1 {
    // some code
    val wasValidCall = false

    //Single structure to indicate true and false case
    if (wasValidCall) {
        return PageResult1.Success("conent")
    } else {
        return PageResult1.Error(404, "conent")

    }
}

fun main(args: Array<String>) {
    val p = getURLPage("url")

    when (p) {
        is PageResult1.Success -> println(p.content)
        is PageResult1.Error -> println(p.code)
    }
}