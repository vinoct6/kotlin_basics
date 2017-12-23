package classes3

//ToString, hascode , equals
data class CustomerKotlin(var id: Int, var name: String, var email: String) {

    // You can override
    override fun toString(): String {
        return "{\"id\" : \"$id\", \"name\":\"$name\" , \"email\": \"$email\"}"
    }
}

fun main(args: Array<String>) {
    val customer1 = CustomerKotlin(1, "Vinoth", "vinoth@gmail.com")
    val customer2 = CustomerKotlin(1, "Vinoth", "vinoth@gmail.com")


    if (customer1 == customer2) println("They are the same")

    //Data classes also allow to you to copy

    val customer3 = customer1

    val customer4 = customer1.copy()

    //Override properties while copying
    val customer5 = customer1.copy(email = "abc.gamil.com")

    println(customer1)
}