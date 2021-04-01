package structural.decorator

/**
 * Decorator
 */
abstract class Clothes(protected val person: Person) : Person {

    override fun dressUp(): String {
        return person.dressUp()
    }

}
