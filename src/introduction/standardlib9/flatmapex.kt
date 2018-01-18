package introduction.standardlib9


data class Student(val name: String, val subjects: List<String>)

fun main(args: Array<String>) {
    val student1 = Student("Vinoth", listOf("Physics", "Maths", "English"))
    val student2 = Student("Varshyth", listOf("Geography", "Maths", "Social"))

    val students = listOf(student1, student2)

    val res = students.flatMap { it ->
        it.subjects
    }.distinct()

    println(res)
}