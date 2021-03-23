package creational.factory.animal

import creational.factory.Animal

class Pig : Animal {
    override fun getAnimal(): String = "Pig"

    override fun makeSound(): String = "Oink!"
}