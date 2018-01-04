package advanced.functions1


class Request1(val method: String, val query: String, val contentType: String)

class Response1(val contents: String, var status: Status1) {
    operator fun invoke(status: Status1.() -> Unit) {

    }
}

class Status1(var code: Int, var description: String)

class RouteHandler1(val request1: Request1, val response1: Response1) {
    var executeNext = false
    fun next() {
        executeNext = true
    }
}


/**
 * The parameter f is an extension function on the RouteHandler and the return value is also
 * an extension function
 *
 */
fun routeHandler1(path: String, f: RouteHandler1.() -> Unit): RouteHandler1.() -> Unit = f


fun main(args: Array<String>) {

    routeHandler1("/index.html") {
            response1 {
                code = 404  //We got rid of Status, by using invoke

            }
    }

    val manager = Manager()

    manager("Invoke here")

}

///////

class Manager {
    operator fun invoke(value : String) {

    }
}