package advanced.delegation3

fun localDelegatedProperties() {
    val lazy by lazy  { initLate()}
}

fun initLate(): String {
    throw  UnsupportedOperationException();
}
