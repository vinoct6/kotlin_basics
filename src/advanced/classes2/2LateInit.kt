package advanced.classes2


interface Repository {
    fun getAll() :Customer
}


class CustomerController() {
    //uninitializedpropertyreferenceexception if this is not initiliazed
    lateinit var repository : Repository

    fun customer() : Customer {
        return repository.getAll()
    }
}