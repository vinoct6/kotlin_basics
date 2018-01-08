package advanced.generics4

/**
 * Structure<T> is contra variant when
 *
 * Given that Employee is a subtype of Person
 * and Structure<Person> is a subtype of Structure<Employee>
 *
 *
 * Values are passed in , instead of passed out
 * declaration site to indicate contravariance - ? super T
 */

interface WriteOnlyRepo<in T>
{
    fun save(obj : T)
    fun saveAll (objs : List<T>)
}