package inheritance4

/**
 * All classes are final by default, so make it open
 */

open class Person {

    open fun validate() {

    }

}

class Customer : Person() {

    override fun validate() {
    }

    /* constructor() : super() {

     }*/
}

abstract class StoredEntity {

}

class Employee : StoredEntity() {

}