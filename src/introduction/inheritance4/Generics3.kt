package introduction.inheritance4

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

class GenericRepository<T> : Repository<T> {
    override fun getAll(): List<T> {
        TODO("not implemented")
    }

    override fun getById(id: Int): T {
        TODO("not implemented")
    }
}

fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()
}



