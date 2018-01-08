package advanced.delegation3

import java.io.UnsupportedEncodingException
import kotlin.reflect.KProperty


class Service {
    var someProperty : String by ExternalFunctionality()
}

//It ismore like externalizing getter and setter
class ExternalFunctionality {

    var backingField = "default"

    operator fun getValue(service: Service, property: KProperty<*>): String {
        println("get value called with params")
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, value: String) {
        backingField = value
    }

}