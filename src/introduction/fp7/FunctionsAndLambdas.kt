package introduction.fp7


/**
 * Higher order functions : Function returning function , or a function taking function as a parameter
 *
 */

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun operation(x: Int, op: (Int) -> Unit) {

}

fun route(path: String, vararg actions: (String, String) -> String) {

}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun unaryOperation(x: Int, op: (Int) -> Int) {

}

fun unaryOperation(op: (Int) -> Int) {

}


fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {

    }
}


fun main(args: Array<String>) {
    val sum = operation(5, 6, ::sum)
    println(sum)

    // Lambda Operation
    val mul = operation(6, 5, { x, y -> x * y })
    println(mul)

    unaryOperation(5, { x -> x * x })

    // Use of 'it'
    unaryOperation(5, { it * it })

    // This is equivalent to

    unaryOperation(5) { it * it }

    //What is good about it ? This is useful while creating DSLs
    //If the last or only parameter is a function, it doesn't need to into brackets
    unaryOperation { it * it }

    unaryOperation {
        it * it
    }

    //See this. 'transaction' looks like a keyword
    val db = Database()

    transaction(db) {
        // code here
    }

    // You could right a full function - anonymus function
    unaryOperation(4, fun(x: Int): Int { return x * x })
}