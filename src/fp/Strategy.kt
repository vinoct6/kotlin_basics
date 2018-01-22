package fp


interface Calculator {
    fun calculate(x: Int, y: Int): Int
}

class Adder : Calculator {
    override fun calculate(x: Int, y: Int): Int {
        return x + y
    }

}

class Multiplier : Calculator {
    override fun calculate(x: Int, y: Int): Int {
        return x * y
    }
}


class Calculate(private val c: Calculator) {
    fun calc(x: Int, y: Int): Int {
        return c.calculate(x, y)
    }
}


fun calculateStrategy(x: Int, y: Int, op: (Int, Int) -> Int): Int = op(x, y)


fun main(args: Array<String>) {
    val c = Calculate(Multiplier())
    println(c.calc(10, 6))
    println(calculateStrategy(5, 6){ x, y -> x + y })
}