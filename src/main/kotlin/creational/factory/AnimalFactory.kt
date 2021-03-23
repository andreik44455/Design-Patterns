package creational.factory

import creational.factory.animal.Cat
import creational.factory.animal.Dog
import creational.factory.animal.Pig

class AnimalFactory {

    companion object {
        fun getAnimal(type: String): Animal? = when (type) {
            "cat", "Cat" -> Cat()
            "dog", "Dog" -> Dog()
            "pig", "Pig" -> Pig()
            else -> null
        }
    }

}