package introduction.classes3

import java.util.*

//This is a valid class
class Person

class Customer {

    /*
    Kotlin does not have the concept of fields. You can only declare properties
     */

    var id = 0
    var name: String = ""

    val surname: String = "Hello" // Immutable properties
}

/**
 * Traditional way of initializing
 *
 */
class Customer1(initId: Int, initName: String) {
    var id = initId
    var name = initName
}


/**
 * This is another way of doing it
 *
 * Use values in the constructors.
 *
 * var declares a read/write property.
 * If you remove the var, it is no longer a property. It is just a value being passed.
 */
class Customer2(var id: Int, var name: String = "Default")


/**
 * Class with init block
 * Called at the time class is created
 *
 */

class Customer3(var id: Int, var name: String) {
    init {
        name = name.toUpperCase()
    }

    //Secondary constructors
    constructor(email: String) : this(0, "Vinoth")


}

/**
 * Class with custom getters , setters , member functions
 */
class Customer4(var id: Int, var name: String, val yearOfBirth: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var ssn: String = ""
        set(value) {
            if (!value.startsWith("sn")) throw IllegalArgumentException("Not valid")
            field = value //'field' is the backing field that holds the value
        }

    //Member functions
    fun customerAsString() {
        println( "id : $id , name : $name")
    }

}


fun main(args: Array<String>) {
    val customer = Customer()  // No new keyword

    customer.id = 10
    customer.name = "Vinoth"

    val customer1 = Customer1(19, "Vinoth")
    val customer2 = Customer2(20, "Varshyth")
    val customer22 = Customer2(20)
    customer2.id = 0
    customer2.name = "hello"

    val customer3 = Customer3(email = "hello")
}

/**
 * Visibility modifier
 *
 * The default visibility modifier is public
 *
 * public , private , internal  (anywhere in the same module)
 *
 * visbility for classes
 *---------------------
 * private, protected, internal
 */

