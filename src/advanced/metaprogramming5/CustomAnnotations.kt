package advanced.metaprogramming5

@Target(AnnotationTarget.CLASS)
@Repeatable
@MustBeDocumented
annotation class Table(val name: String)

@Target(AnnotationTarget.PROPERTY)
annotation class Field(val name: String)

@Table(name = "ContactTable")
 class Contact(val id: Int, @Field(name = "name") val name: String, val email: String)


fun main(args: Array<String>) {
    val a = Contact::class.annotations.find { it.annotationClass.simpleName == "Table" }
    println(a)

}