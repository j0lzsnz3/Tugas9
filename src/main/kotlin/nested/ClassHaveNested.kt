package nested

/**
 * Contoh class yang memiliki outer class.
 * class outer mempunyai function untuk mencetak value dari parameter OuterClass
 */
class ClassHaveNested {
    class OuterClass(
        private val valueForOuter: String
    ) {
        fun printValueOuter() = println("Dari Outer Class : $valueForOuter")
    }
}