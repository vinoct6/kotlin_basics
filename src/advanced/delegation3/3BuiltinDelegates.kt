package advanced.delegation3

import kotlin.properties.Delegates

data class Employee(val name: String, val email: String) {

    //Firesoff everytime the value of department changes
    var department : String by  Delegates.observable("" , {property, oldValue, newValue ->
        println("Property ${property.name} has changed from $oldValue to $newValue ")
    })

    fun printName(string: String) {

    }
}


fun main(args: Array<String>) {
    var  e = Employee("Vinoth","Hello")
    e.department="IT"

}