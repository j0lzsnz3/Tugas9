package inner

/**
 * Contoh Class yang memiliki inner class.
 * Kasusnya Inner Class mengambil value dari parameter Parent Class.
 */
class ClassHaveInner(
    private val valueForInner: String
) {
    inner class ClassInner() {
        fun printValueInner() = println("Dari Inner Class : $valueForInner")
    }
}