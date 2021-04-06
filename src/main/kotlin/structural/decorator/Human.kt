package structural.decorator

/**
 * Concrete component
 */
class Human(val name: String) : Person {
    override fun dressUp(): String = "$name's dress up:\n underwear"
}
