package advanced.generics4


//Types and sub types

/**
 * Given an Employee and a Person
 * where Employee is a sub type of Person
 *
 * if Array<Employee> is not a subtype of Array<Person>
 *     &
 * Array<Person> is not a subtype of Array<Employee>
 *
 * We say that the array is invariant.
 *
 * Invariants can be tedious.What if we just want to read values. This is where immutable interfaces can help
 */

open class Person

class Employee : Person()


/**
 * List is immutable. I can pass List<Employee> as well List<Person>.
 * We allow the immutability of the list to
 * allow us variance. This is called co-variance
 *
 */
fun operate(personList: List<Person>) {

}

fun main(args: Array<String>) {
    val e: List<Employee> = listOf(Employee(), Employee())
    //I can pass in List<Employee>
    operate(e)
}
