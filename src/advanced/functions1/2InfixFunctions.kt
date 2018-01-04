package advanced.functions1


//Extension function
infix fun String.shouldBeEqualToValue(value : String) = this == value


fun main(args: Array<String>) {

    "Hello".shouldBeEqualToValue("Hello")

    //If you have extension or member functions with single parameters, you can call this using Infix notation

    val output = "Hello"
    output shouldBeEqualToValue "Hello"
}