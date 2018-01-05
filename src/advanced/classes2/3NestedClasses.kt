package advanced.classes2

class DirectoryExplorer(val user: String) {

    //You can mark this is private
    inner class PermissionCheck {
        fun checkPermission() {
            // You can't access the variable user here because,
            // You can by adding inner modifier
            println(user)
        }
    }

    fun listFolders(folder: String) {
        val permissonCheck = PermissionCheck()
        permissonCheck.checkPermission()
    }
}

fun main(args: Array<String>) {
    val pc = DirectoryExplorer("Vinoth").PermissionCheck()
}