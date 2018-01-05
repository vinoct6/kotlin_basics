package advanced.classes2


class Customer() {

    //Custom getter and setter
    var lastPurchasedAmount: Double = 0.0
        get() = field
        set(value) {
            if (value > 10) {
                field = value
            }
        }

}

fun main(args: Array<String>) {
    val customer = Customer()
    customer.lastPurchasedAmount = 200.0
    println(customer.lastPurchasedAmount)
}