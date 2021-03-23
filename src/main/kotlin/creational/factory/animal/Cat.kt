package creational.factory.animal

import creational.factory.Animal

class Cat : Animal {
    override fun getAnimal(): String = "Cat!"
    override fun makeSound() = println("Meow!")
}
