package fp

abstract  class Coffee {
    fun pourMilk() = println ("Pour Milk")
    fun addCoffeeBeans() = println("Add coffee beans")
    abstract  fun addToppings()
    fun brew() = println("brewing coffee")

    fun makeCoffee() {
        pourMilk()
        addCoffeeBeans()
        addToppings()
        brew()
    }
}


class CoffeeFP(val addToppings : () -> Unit) {
    fun pourMilk() = println ("Pour Milk")
    fun addCoffeeBeans() = println("Add coffee beans")
    fun brew() = println("brewing coffee")

    fun makeCoffee() {
        pourMilk()
        addCoffeeBeans()
        addToppings()
        brew()
    }
}

class Espresso : Coffee() {
    override fun addToppings() {
       println ("Espresso : Pour water and add some more cofee beans");
    }

}

class Cappacinno : Coffee(){
    override fun addToppings() {
        println("Cappacnio: add some more coffee beans and more milk ")
    }

}

fun main(args: Array<String>) {
    val c = Espresso()
    c.makeCoffee()
}