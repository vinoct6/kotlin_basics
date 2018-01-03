package introduction.classes3

enum class Priority(val value: Int) {
    MINOR(-1) {
        override fun text(): String {
            return "My Minor Priority"
        }

        // You can override existing to string
        override fun toString(): String {
            return "Minor Priority"
        }
    },
    NORMAL(1) {
        override fun text(): String {
            TODO("not implemented")
        }
    },
    MAJOR(5) {
        override fun text(): String {
            TODO("not implemented")
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            TODO("not implemented")
        }
    };

    abstract fun text(): String
}

fun main(args: Array<String>) {
    val priority = Priority.CRITICAL
    println(priority)
    println(priority.value)
    println(priority.ordinal)

    for (p in Priority.values()) {
        println(p)
    }

    println(Priority.valueOf("MAJOR"))

    println(Priority.MINOR) // Prints "Minor Priority"

    println(Priority.MINOR.text())

}