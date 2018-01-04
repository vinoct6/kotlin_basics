package advanced.functions1


data class Time(val hours: Int, val min: Int) {
    operator fun plus(time: Time): Time {
        val minutes = this.min + time.min
        //other calculation here
        return Time(hours, minutes)
    }
}

//Operators on String builders :

operator fun StringBuilder.plus(stringBuilder: StringBuilder) {
    stringBuilder.forEach {
        this.append(it)
    }
}

fun main(args: Array<String>) {
    val newTime = Time(10, 40) + Time(3, 30)

    val sb = StringBuilder()

    for (str in sb) {
        str + "value"
    }
}