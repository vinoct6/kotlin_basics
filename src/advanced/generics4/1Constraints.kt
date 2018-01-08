package advanced.generics4

import java.io.Serializable

open class Entity(val id: Int)

class CustomerEntity : Entity(6)

//Upper bound T is a type Entity
class Repository<T : Entity> {
    fun save(entity: T) {
        if (entity.id != 0) {

        }
    }
}

// Multiple Restrictions , now T has to be of Type Entity and Serializable
class Repository1<T> where T : Entity, T : Serializable {
    fun save(entity: T) {
        if (entity.id != 0) {

        }
    }
}

//Restriction on functions
fun <T : Serializable> streamObject(entity: T) {

}

//Without any restrictions, the default is T: Any? - Any that is potentially nullable
//If you want to have non-nullable - then you can do T: Any
