package advanced.delegation3

import kotlin.properties.Delegates

class Veto {
    //Set value only if value starts with string
    var value : String by Delegates.vetoable("String",{property, oldValue, newValue ->
        newValue.startsWith("s")
    })
}

fun main(args: Array<String>) {
    var v = Veto()
    println(v.value)

    v.value = "mud"
    println(v.value)

    v.value = "sleep"
    println(v.value)




}