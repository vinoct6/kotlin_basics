package tidbits6

open class Person

class Employee : Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacation")
        }
    }
}


fun hasVacations(obj: Person) {
    if (obj is Employee) {
        obj.vacationDays(5)    // Notice that the compiler is already checking - so we need to explicitly checking
        // This is smart cast
    }
}

class Contractor : Person()

// What happens when the compiler doesn't know how to do it, or we want to do the casting

var input: Any = 10

fun main(args: Array<String>) {

    val str = input as String // This doesn't work
    println(str.length) // will result in ClassCastException.. Integer cannot be cast into String

    val str1 = input as? String // Try to do the cast - but there is no cast exception
    println(str1?.length)
}


