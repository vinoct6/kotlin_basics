package advanced.delegation3

val String.hasAmpersan : Boolean
    get() = this.contains("%")


fun main(args: Array<String>) {
    val s = "Hello%"
    println(s.hasAmpersan)
}