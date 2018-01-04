package advanced.functions1

/**
 * Unique to Kotlin - Lambda extensions or Lambda's with receivers
 */


class Request(val method: String, val query: String, val contentType: String)

class Response(val contents: String, var status: Status) {
    fun status(status: Status.() -> Unit) {}
}

class Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response) {
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
fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f

fun response(response: Response.() -> Unit) {}

fun main(args: Array<String>) {

    routeHandler("/index.html") {
        /**
         * All extension functions will have access to the members of the class they are extending
         * So , inside this Lambda, you have access to
         */
        if (request.query != "") {
            //process
        }

        response.status.code // how can we turn this into DSLish

        // Looks DSLish

        response {
            status {
                code = 404
            }
        }

    }
}