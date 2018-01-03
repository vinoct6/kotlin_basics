@file:JvmName("UtilityClass")
package introduction.interop8

//If I compile this,this will compile to TopLevelFunctionsKt.class
//YOu can rename the default name though

const val copyRight = 2016

fun prefix(prefix : String , value : String) :String {
    return "$prefix $value"
}
