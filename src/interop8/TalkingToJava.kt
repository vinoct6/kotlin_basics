package interop8


fun main(args: Array<String>) {

     val customer = CustomerJava()

    customer.name = "Vinoth"// use the property - not the getter method

    customer.prettyPrint()

    //Implement a functional interface

    val runnable = Runnable { println ("Hello") }

    //Working with nulls
    val kr = CustomerRepoImpl()
    val customerRes = kr.fetchById()

    //So what would happen is there will be lot of question marks in the code
    customerRes?.id

    //So it is actually upto you to decide what can be and cannot be null


    val person = PersonJava()

    // Both sometimesNull and neverNull returns String! - This is what is called a platform type
    //potential nullable type
    val sometimesNull = person.sometimesNull()


    //if you annotate it with jetbrains @NotNull, it won't show that exclamation mark

}

// Inherit a java class
class PersonKotlin : PersonJava() {

}

