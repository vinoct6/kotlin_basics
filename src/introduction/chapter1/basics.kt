package introduction.chapter1

fun main(args: Array<String>) {

    /**
     * var is not a dynamic type
     * var is a way to declare mutable variable
     */
    var streetNumber: Int
    var streetName: String = "High Street"

    var streetName1 =  "high street" // Type Inference


    //---------------------------------

    val zip = "E 11 P1" // Immutable variable


    val multiLine = """ hello
        |this is a multiline strin
    """.trimMargin()


    //String interpolation

    val year =10
    println("A decade is $year")

    val name = "Vinoth"

    println("The length of the name is ${name.length}")

    /**
     * One package can have multiple main functions
     */
}
