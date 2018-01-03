package introduction.standardlib9

import java.util.*


fun main(args: Array<String>) {

    // This List is an immutable one , but ArrayList is Java mutable
    //Declaring immutable and instantiating with mutable
    var list: List<String> = ArrayList()

    var list1 = listOf("Hello", "there")

    var emptyList = emptyList<String>()

    val numbers = 1..100

    println(list1.javaClass) //class java.util.Arrays$ArrayList
    println(emptyList.javaClass) // class kotlin.collections.EmptyList

    //Do it manually
    // Note that this is a immutable list
    val arrayList = Arrays.asList("Hello", "There")

    val mutableCities = mutableListOf("Madrid", "Dublin")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"))

    val booleans = booleanArrayOf(true, false, true)
}