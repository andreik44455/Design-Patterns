package creational.factory.animal

import creational.factory.Animal

class Dog : Animal {
    override fun getAnimal(): String = "Dog"
    override fun makeSound(): String = "Bark!"
}