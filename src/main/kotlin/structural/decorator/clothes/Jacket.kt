package structural.decorator.clothes

import structural.decorator.Clothes
import structural.decorator.Person

/**
 * Concrete decorator
 */
class Jacket(person: Person) : Clothes(person) {

    override fun dressUp(): String {
        return super.dressUp() + wearJacket()
    }

    private fun wearJacket(): String = "\n leather jacket"
}
