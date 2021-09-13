import inner.ClassHaveInner
import nested.ClassHaveNested

fun main(args: Array<String>) {
    /**
     * memberikan value ke parameter yang ada di dalam constructor ClassHaveInner,
     * yang nantinya akan dicetak oleh inner class.
     */

    val classHaveInner = ClassHaveInner("dari func main")
    classHaveInner.ClassInner().printValueInner()

    /**
     * Outer class tidak bisa mengambil value dari parent class.
     * Jadi untuk bisa mencetak value dari parameter, harus dilempar ke class Outer Class.
     */
    val classOuter = ClassHaveNested.OuterClass("dari func main")
    classOuter.printValueOuter()
}