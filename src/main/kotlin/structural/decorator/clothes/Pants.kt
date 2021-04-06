package structural.decorator.clothes

import structural.decorator.Clothes
import structural.decorator.Person

/**
 * Concrete decorator
 */
class Pants(person: Person) : Clothes(person) {

    override fun dressUp(): String {
        return super.dressUp() + wearPants()
    }

    private fun wearPants(): String = "\n grey pants"
}
