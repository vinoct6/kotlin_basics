package advanced.metaprogramming5

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties


fun kotlinType(obj : KClass<*>) {
    println(obj.qualifiedName)
}

fun main(args: Array<String>) {
//    println(Transaction::class) // This is a KClass

    val classInfo = Transaction::class

    classInfo.memberProperties.forEach {
        println( "${it.name} of type ${it.returnType}")
    }

    classInfo.constructors.forEach {
        println("${it.name} -  ${it.parameters}")
    }

    kotlinType(Transaction::class)


   //Get the constructor
    val t = ::Transaction

    println(t)

    val transaction = t.call(1,2000,"hello")
    println(transaction.description)

    val validateFunction = Transaction::validate


    val t1 = Transaction(1, 200.0, "New value")

    val kClass = Transaction::class
    val find = kClass.memberProperties.find { it.name == "description" }
    println(find?.get(t1))



}