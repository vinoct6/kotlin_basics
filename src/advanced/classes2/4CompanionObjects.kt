package advanced.classes2


class Log() {

    companion object Factory {
        @JvmStatic
        fun createFileLog(name: String): Log = Log(name)
    }

    constructor(name: String) : this()
}

fun main(args: Array<String>) {
    val log = Log()
    val fileLog = Log.createFileLog("file.log")
}