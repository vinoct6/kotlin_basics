package advanced.generics4

/**
 * Kotlin offers use site variance as well
 */

// By default mutable list is not co-variant - so we make it so by adding out
fun <T> copy (list : MutableList<out T>) {

}


/**
 * star projects are a safe way to indicate a sub type of a projection
 */
