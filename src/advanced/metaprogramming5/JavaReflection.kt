package advanced.metaprogramming5

import java.lang.reflect.Type

class Transaction(val id : Int , val amount : Double, var description : String) {
    fun validate () {
        if(amount > 1000){
            println("too large")
        }
    }
}

fun introspectInstance(obj : Any) {

    println("Class ${obj.javaClass.simpleName}")
    println("properties ..")

    obj.javaClass.declaredFields.forEach {
        println("${it.name} of ${it.type}")
    }

    println("Functions ")

    obj.javaClass.declaredMethods.forEach {
        println("${it.name} ")
    }


}


fun getType(obj : Type) {
    println (obj.typeName)
}

fun main(args: Array<String>) {
    getType(Transaction::class.java)

    introspectInstance(Transaction(100,100.0,"hello"))
}