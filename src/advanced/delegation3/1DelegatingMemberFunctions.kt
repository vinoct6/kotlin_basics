package advanced.delegation3

import advanced.classes2.Customer


interface Repository {
    fun getById(id : Int) : Customer
}

interface Logger {
    fun logAll() {

    }
}
//Delegation

class Controller(repository: Repository, logger : Logger) : Repository by repository, Logger by logger {

    fun index() : String {
        return getById(1).toString()
    }

}