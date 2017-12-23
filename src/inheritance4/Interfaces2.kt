package inheritance4

/**
 * You cannot maintain state in interface
 */
interface CustomerRespository {

    val isEmpty: Boolean // You cannot initialize it to true for example - because it can't maintain state,however, it can have getters and setters
        get() = true


    fun store(obj: Customer) {
        // there is an actual body in interface
    }

    fun getById(id: Int): Customer
}

class SQLRepository : CustomerRespository {
    override fun getById(id: Int): Customer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}


//Fixing the diamond problem ?
interface I1 {
    fun f1() {
        println("I1 f1")
    }
}

interface I2 {
    fun f1() {
        println("I1 f1")
    }
}

class Class1 : I1, I2 {
    override fun f1() {
        super<I1>.f1()
    }

}

fun main(args: Array<String>) {

}