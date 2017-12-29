package classes3

import java.io.IOException

//ToString, hascode , equals
data class CustomerKotlin(var id: Int, var name: String, var email: String, val phone : String?) {

    @JvmField
    var someField = "Value"

    @JvmOverloads
    fun changeStatus(status : Status = Status.CURRENT) {

    }

    @JvmName("preferential")
    fun makePreferred() {

    }

   @Throws(IOException::class)
    fun loadStatistics(filename: String) {
        if (filename == "") {
            throw IOException("No blank")
        }
    }

    // You can override
    override fun toString(): String {
        return "{\"id\" : \"$id\", \"name\":\"$name\" , \"email\": \"$email\"}"
    }
}

fun CustomerKotlin.extension() {

}

enum class Status {
    CURRENT, PAST

}

fun main(args: Array<String>) {
    val customer1 = CustomerKotlin(1, "Vinoth", "vinoth@gmail.com","")
    val customer2 = CustomerKotlin(1, "Vinoth", "vinoth@gmail.com","")


    if (customer1 == customer2) println("They are the same")

    //Data classes also allow to you to copy

    val customer3 = customer1

    val customer4 = customer1.copy()

    //Override properties while copying
    val customer5 = customer1.copy(email = "abc.gamil.com")

    println(customer1)

     customer1.changeStatus()
}