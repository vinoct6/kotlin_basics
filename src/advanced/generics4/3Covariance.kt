package advanced.generics4


/**
 * List<T> is co-variant when
 *
 * Employee is a subtype of Person
 * and
 * List<Employee> is a subtype of List<Person>
 *
 *
 * We often say, values are passed out - we don't modify anything
 * In Kotlin we use declaration site to indicate co-variance  ( out modifier - similar to ? extends T)
 *
 * Read about declaration-site-variance vs use-site-variance
 * https://schneide.wordpress.com/2015/05/11/declaration-site-and-use-site-variance-explained/
 *
 */

//We are always just producing values- so we can add out
interface ReadOnlyRepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}


